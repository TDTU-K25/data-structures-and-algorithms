public class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int num_nodes;

    public MyQueue() {
        front = null;
        rear = null;
        num_nodes = 0;
    }

    public void enQueue(E data) {
        if (rear == null) {
            rear = new Node<E>(data);
            front = rear;
        } else {
            rear.setNext(new Node<E>(data));
            rear = rear.getNext();
        }
        num_nodes++;
    }

    public E deQueue() {
        if (front == null) {
            return null;
        }
        E temp = front.getValue();
        front = front.getNext();
        num_nodes--;
        return temp;
    }

    public E getPeek() {
        if (front == null) {
            return null;
        }
        return front.getValue();
    }

    public boolean isEmpty() {
        return (num_nodes == 0);
    }
}