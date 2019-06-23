
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.script.Bindings;

public class JPrologBindings implements Bindings {

	private final Map<Const, Term> bindings;
	private EntrySet entrySet;
	private KeySet keySet;
	private Values values;

	public JPrologBindings() {
		super();
		bindings = new HashMap<Const, Term>();
	}

	public JPrologBindings(Bindings bindings) {
		this();
		if (bindings instanceof JPrologBindings) {
			this.bindings.putAll(((JPrologBindings) bindings).bindings);
		} else {
			for (final Map.Entry<String, Object> e : bindings.entrySet()) {
				put(e.getKey(), e.getValue());
			}
		}
	}

	@Override
	public boolean containsKey(Object key) {
		return get(key) != null;
	}

	@Override
	public Object get(Object key) {
		return toJava(bindings.get(CONST(key)));
	}

	private Object toJava(Term res) {
		if (res == null)
			return null;
		res = res.dref();
		try {
			return PrimaryConversion.convert2java(res);
		} catch (final JPrologScriptException ex) {
			return null;
		}
	}

	@Override
	public Object put(String name, Object value) {
		return toJava(bindings.put(CONST(name), PrimaryConversion.convert2Prolog(value)));
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> arg0) {
		for (final Map.Entry<? extends String, ? extends Object> e : arg0.entrySet()) {
			put(e.getKey(), e.getValue());
		}
	}

	@Override
	public Object remove(Object key) {
		return toJava(bindings.remove(CONST(key)));
	}

	@Override
	public void clear() {
		bindings.clear();
	}

	@Override
	public boolean containsValue(Object value) {
		return bindings.containsValue(PrimaryConversion.convert2Prolog(value));
	}

	@Override
	public synchronized Set<java.util.Map.Entry<String, Object>> entrySet() {
		if (entrySet == null)
			entrySet = new EntrySet();
		return entrySet;
	}

	@Override
	public boolean isEmpty() {
		return bindings.isEmpty();
	}

	@Override
	public synchronized Set<String> keySet() {
		if (keySet == null)
			keySet = new KeySet();
		return keySet;
	}

	@Override
	public int size() {
		return bindings.size();
	}

	@Override
	public synchronized Collection<Object> values() {
		if (values == null)
			values = new Values();
		return values;
	}

	public Term getProlog(Const paramName) {
		return bindings.get(paramName);
	}

	public void putProlog(Const cname, Term value) {
		bindings.put(cname, value);
	}

	private class EntrySet extends AbstractSet<Map.Entry<String, Object>> {

		@Override
		public boolean add(java.util.Map.Entry<String, Object> e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(Collection<? extends java.util.Map.Entry<String, Object>> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {
			JPrologBindings.this.clear();
		}

		@Override
		public boolean contains(Object o) {
			if (o instanceof Map.Entry) {
				return containsKey(((Map.Entry<?, ?>) o).getKey());
			}
			return false;
		}

		@Override
		public Iterator<java.util.Map.Entry<String, Object>> iterator() {
			return new EntryIterator();
		}

		@Override
		public boolean remove(Object o) {
			JPrologBindings.this.remove(o);
			return true;
		}

		@Override
		public int size() {
			return JPrologBindings.this.size();
		}

	}

	private class KeySet extends AbstractSet<String> {

		@Override
		public boolean add(String e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(Collection<? extends String> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {
			JPrologBindings.this.clear();
		}

		@Override
		public boolean contains(Object o) {
			return containsKey(o);
		}

		@Override
		public Iterator<String> iterator() {
			return new KeyIterator(bindings.keySet().iterator());
		}

		@Override
		public boolean remove(Object o) {
			JPrologBindings.this.remove(o);
			return true;
		}

		@Override
		public int size() {
			return JPrologBindings.this.size();
		}

	}

	private class Values extends AbstractCollection<Object> {

		@Override
		public boolean add(Object e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(Collection<? extends Object> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {
			JPrologBindings.this.clear();
		}

		@Override
		public boolean contains(Object o) {
			return containsValue(o);
		}

		@Override
		public Iterator<Object> iterator() {
			return new ValueIterator(bindings.values().iterator());
		}

		@Override
		public boolean remove(Object o) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int size() {
			return JPrologBindings.this.size();
		}

	}

	private class EntryIterator implements Iterator<Map.Entry<String, Object>> {

		private final Iterator<Map.Entry<Const, Term>> it;
		private Map.Entry<String, Object> next, returned;

		public EntryIterator() {
			it = bindings.entrySet().iterator();
			next = findNext();
		}

		@Override
		public boolean hasNext() {
			if (next != null)
				return true;
			next = findNext();
			return next != null;
		}

		private Map.Entry<String, Object> findNext() {
			while (it.hasNext()) {
				final Map.Entry<Const, Term> e = it.next();
				try {
					if (e.getKey().equals(Const.javaNull())) {
						return new Entry<String, Object>(null, PrimaryConversion.convert2java(e.getValue()));
					}
					return new Entry<String, Object>(PrimaryConversion.convert2java(e.getKey()).toString(),
							PrimaryConversion.convert2java(e.getValue()));
				} catch (final JPrologScriptException ex) {
				}
			}
			return null;
		}

		@Override
		public java.util.Map.Entry<String, Object> next() {
			if (!hasNext())
				throw new NoSuchElementException();
			returned = next;
			return next;
		}

		// @SuppressWarnings("unlikely-arg-type")
		@Override
		public void remove() {
			// @todo:
			// Unlikely argument type String for remove(Object) on a Map<Const,Term>
			final String key = returned.getKey();
			if (false) {
				Term t = bindings.get(key);
				bindings.remove(t);
			} else {
				bindings.remove(key);
			}
		}

	}

	private static class KeyIterator implements Iterator<String> {

		private final Iterator<Const> it;

		KeyIterator(Iterator<Const> iterator) {
			super();
			if (iterator == null)
				throw new NullPointerException();
			it = iterator;
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public String next() {
			return it.next().fname();
		}

		@Override
		public void remove() {
			it.remove();
		}

	}

	private static class ValueIterator implements Iterator<Object> {

		private final Iterator<Term> it;
		private Object next;
		private boolean hasMore;

		ValueIterator(Iterator<Term> iterator) {
			super();
			if (iterator == null)
				throw new NullPointerException();
			it = iterator;
		}

		@Override
		public boolean hasNext() {
			if (hasMore)
				return true;
			findNext();
			return next != null;
		}

		private void findNext() {
			while (it.hasNext()) {
				try {
					next = PrimaryConversion.convert2java(it.next());
					hasMore = true;
					return;
				} catch (final JPrologScriptException ex) {
				}
			}
			hasMore = false;
		}

		@Override
		public Object next() {
			if (!hasNext())
				throw new NoSuchElementException();
			hasMore = false;
			return next;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	private static class Entry<K, V> implements Map.Entry<K, V> {

		private final K key;
		private final V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Entry) {
				final Entry<?, ?> e = (Entry<?, ?>) o;
				return key.equals(e.getKey());
			}
			return false;
		}

		@Override
		public int hashCode() {
			return key.hashCode();
		}

	}

}
