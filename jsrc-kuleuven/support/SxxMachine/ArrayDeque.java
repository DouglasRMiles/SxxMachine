package SxxMachine;

/**
 * Implementing a Deque with a Circular Array.
 *
 * @author Samuel T. C. Santos
 * @version 1.0
 * @param <E>
 */
class jPArrayDeque<E> extends jPDeque<E> {

    private E[] data;
    private static final int CAPACITY = 5;
    private int front = 0;
    private int back = 0;

    private int size = 0;

    /**
     * Constructs a ArrayDeque with default capacity.
     */
    public jPArrayDeque() {
        this(CAPACITY);
    }

    /**
     * Constructs a ArrayDeque with a given capacity.
     *
     * @param capacity
     */
    @SuppressWarnings("unchecked")
    public jPArrayDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid Capacity!");
        }
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        return isEmpty() ? null : data[front];
    }

    public E last() {
        return isEmpty() ? null : data[back];
    }

    @Override
    public void addFirst(E element) throws DequeOverflowException {
        if (size == data.length)
            throw new DequeOverflowException();
        if (isEmpty()) {
            data[front] = element;
        } else {
            front = (front - 1 + data.length) % data.length;
            data[front] = element;
        }
        size++;
    }

    @Override
    public void addLast(E element) throws DequeOverflowException {
        if (size == data.length)
            throw new DequeOverflowException();

        back = back % data.length;
        data[back] = element;

        size++;
    }

    @Override
    public E removeFirst() throws DequeUnderflowException {
        if (isEmpty())
            throw new DequeUnderflowException();

        final E answer = data[front];
        front = (front + 1) % data.length;
        size--;

        return answer;
    }

    @Override
    public E removeLast() throws DequeUnderflowException {
        if (isEmpty())
            throw new DequeUnderflowException();

        final E answer = data[back];
        back = (back - 1 + data.length) % data.length;
        size--;

        return answer;
    }

    public E pollLast() {
        // TODO Auto-generated method stub
        return null;
    }

    public void add(E po) {
        // TODO Auto-generated method stub

    }

}