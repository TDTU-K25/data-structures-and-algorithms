import java.util.NoSuchElementException;

public class SortedLinkedList extends SinglyLinkedList<Integer> {

    public SortedLinkedList() {
        super();
    }

    public void addSortedLinkedList(int item) {
        super.head = addSortedLinkedList(super.head, item);
    }

    public Node<Integer> addSortedLinkedList(Node<Integer> p, int item) {
        if (p == null || item < p.getData()) {
            return new Node<Integer>(item, p);
        } else {
            p.setNext(addSortedLinkedList(p.getNext(), item));
            return p;
        }
    }

    public int countEvenNumbers(Node<Integer> n) {
        if (n != null) {
            if (n.getData() % 2 == 0) {
                return 1 + countEvenNumbers(n.getNext());
            } else {
                return 0 + countEvenNumbers(n.getNext());
            }
        } else {
            return 0;
        }
    }

    public int sumAllNumbers(Node<Integer> n) {
        if (n != null) {
            return n.getData() + sumAllNumbers(n.getNext());
        } else {
            return 0;
        }
    }
}