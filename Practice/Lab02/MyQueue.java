import java.util.*;

public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front;
    private Node<E> rear;
    private int num_nodes;

    public MyQueue() {
        front = null;
        rear = null;
        num_nodes = 0;
    }

    @Override
    public void enQueue(E item) {
        if (front == null) {
            rear = new Node<E>(item);
            front = rear;
        } else {
            rear.setNext(new Node<E>(item));
            rear = rear.getNext();
        }
        num_nodes++;
    }

    @Override
    public E getFront() throws NoSuchElementException {
        if (front == null) {
            throw new NoSuchElementException();
        }
        return front.getData();
    }

    @Override
    public E deQueue() throws NoSuchElementException {
        E temp = getFront();
        front = front.getNext();
        num_nodes--;
        return temp;
    }

    @Override
    public int size() {
        return num_nodes;
    }

    @Override
    public boolean isEmpty() {
        return (num_nodes == 0);
    }

    @Override
    public boolean contains(E item) {
        Node<E> temp = front;
        while (temp != null) {
            if (temp.getData().equals(item)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public void print() throws NoSuchElementException {
        if (front == null) {
            throw new NoSuchElementException();
        } else {
            Node<E> temp = front;
            System.out.print("Queue: " + temp.getData());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(", " + temp.getData());
            }
            System.out.println();
        }
    }
}