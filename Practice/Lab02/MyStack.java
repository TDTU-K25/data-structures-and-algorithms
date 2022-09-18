import java.util.*;

public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int num_nodes;

    public MyStack() {
        top = null;
        num_nodes = 0;
    }

    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        num_nodes++;
    }

    @Override
    public E getPeek() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    @Override
    public E pop() throws EmptyStackException {
        E temp = getPeek();
        top = top.getNext();
        num_nodes--;
        return temp;
    }

    @Override
    public int size() {
        return num_nodes;
    }

    @Override
    public boolean contains(E item) {
        Node<E> temp = top;
        while (temp != null) {
            if (temp.getData().equals(item)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (num_nodes == 0);
    }

    @Override
    public void print() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            Node<E> temp = top;
            System.out.print("Stack(Top->Bottom): " + temp.getData());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(", " + temp.getData());
            }
            System.out.println();
        }
    }
}