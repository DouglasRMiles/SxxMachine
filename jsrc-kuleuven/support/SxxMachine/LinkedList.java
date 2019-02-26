package SxxMachine;

import java.util.Iterator;

class jPLinkedList<T> extends jPDeque<T> {

    public jPLinkedList() {
    }

    @Override
    public Iterator<T> iterator() {
        return super.iterator();
    }

    public void add(T item) {
        super.addLast(item);
    }

}
