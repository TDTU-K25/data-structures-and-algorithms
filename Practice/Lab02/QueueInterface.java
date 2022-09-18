import java.util.*;

public interface QueueInterface<E> {
    public void enQueue(E item);

    public E deQueue() throws NoSuchElementException;

    public int size();

    public boolean contains(E item);

    public void print() throws NoSuchElementException;

    public boolean isEmpty();

    public E getFront() throws NoSuchElementException;
}