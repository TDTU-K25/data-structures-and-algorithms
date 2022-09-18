// Exercise 5
public class QueueSTK<E> {
    private MyStack<E> stk1;
    private MyStack<E> stk2;

    public QueueSTK() {
        stk1 = new MyStack<E>();
        stk2 = new MyStack<E>();
    }

    public void offerItems(E[] items) {
        for (E item : items) {
            stk1.push(item);
        }

        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }
    }

    public E getFront() {
        if (stk2.isEmpty()) {
            return null;
        }
        return stk2.getPeek();
    }

    public E deQueue() {
        if (stk2.isEmpty()) {
            return null;
        }
        return stk2.pop();
    }

    public int size() {
        return stk2.size();
    }

    public boolean isEmpty() {
        return stk2.isEmpty();
    }

    public void print() {
        stk2.print();
    }

    public boolean contains (E item) {
        return stk2.contains(item);
    }
}