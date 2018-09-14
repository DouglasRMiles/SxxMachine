package SxxMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * List term that allows tail addition to the list without recreating the list.
 * This class behaves like a view for underlying List instance.
 */
public class ListViewTerm extends ListTerm {
	// the class is necessary to make ListTerm.isImmutable() to return false
	private final static Term NOT_IMMUTABLE = new Term() {
		@Override
		public boolean unify(Term t, Trail trail) {
			return false;
		}

		@Override
		public boolean isImmutable() {
			return false;
		}

		@Override
		public String name() {
			return "";
		}

		@Override
		public void toString(StringBuilder sb) {

		}

		@Override
		public void toQuotedString(StringBuilder sb) {

		}

		@Override
		public int compareTo(Term o) {
			return 0;
		}
	};
	/** the list of terms */
	private final List<Term> list;
	/** index of element in the {@link SxxMachine.ListViewTerm#list} represented by this instance*/
	private final int index;
	/** holds next {@link SxxMachine.ListViewTerm} instance,
	 * the value is lazy initialized */
	private Term next = null;

	public ListViewTerm(Term head) {
		super(head, NOT_IMMUTABLE);
		this.list = new ArrayList<>();
		list.add(head);
		this.index = 0;
	}

	private ListViewTerm(List<Term> list, int index) {
		super(list.get(index), NOT_IMMUTABLE); // makes isImmutable to return false
		this.list = list;
		this.index = index;
	}

	@Override
	public ListTerm add(Term term){
		list.add(term);
		return this;
	}

	@Override
	public Term cdr() {
		if (next!=null) {
			return next;
		} else if (index + 1 < list.size()) {
			return next = new ListViewTerm(list, index + 1);
		} else {
			return Prolog.Nil;
		}
	}

	@Override
	protected Term copy(IdentityHashMap<VariableTerm, VariableTerm> copyHash) {

		Term result = Prolog.Nil;
		for(int i=list.size()-1; i>=index; i--){
			result = new ListTerm(list.get(i).copy(copyHash), result);
		}
		return result;
	}

	@Override
	public Term arg(int nth) {
		return list.get(index+nth);
	}

	@Override
	public int length() {
		return list.size() - index;
	}

	@Override
	public List toJava() {
		return Collections.unmodifiableList(list.subList(index, list.size()));
	}

	@Override
	public boolean isGround() {
		for(int i=list.size()-1; i>=index; i--){
			if (!list.get(i).isGround()){
				return false;
			}
		}
		return true;
	}
}
