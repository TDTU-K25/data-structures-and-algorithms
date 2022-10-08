public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E data) {
        value = data;
        next = null;
    }

    public Node(E data, Node<E> next) {
        value = data;
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }
}