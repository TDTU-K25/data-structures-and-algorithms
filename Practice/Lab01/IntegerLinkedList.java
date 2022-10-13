import java.util.*;

public class IntegerLinkedList extends SinglyLinkedList<Integer> {

    public IntegerLinkedList() {
        super();
    }

    public int countEven() {
        int count = 0;
        Node<Integer> temp = getHead();
        while (temp != null) {
            if (temp.getData() % 2 == 0) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrime() {
        int count = 0;
        Node<Integer> temp = getHead();
        while (temp != null) {
            if (isPrime(temp.getData())) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public void addBeforeFirstEvenItem(int X) throws NoSuchElementException {
        if (getHead() != null) {
            if (getHead().getData() % 2 == 0) {
                addFirst(X);
            } else {
                Node<Integer> prev = getHead();
                Node<Integer> curr = getHead().getNext();
                while (curr != null) {
                    if (curr.getData() % 2 == 0) {
                        prev.setNext(new Node<Integer>(X, curr));
                        return;
                    }
                    prev = curr;
                    curr = curr.getNext();
                }
                throw new NoSuchElementException("No even item in list");
            }
        } else {
            throw new NoSuchElementException("Empty list");
        }
    }

    public int maxItem() throws NoSuchElementException {
        if (isEmpty())
            throw new NoSuchElementException("Empty list");
        int max = getHead().getData();
        Node<Integer> temp = getHead().getNext();
        while (temp != null) {
            if (max < temp.getData()) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public void reverse() {
        Node<Integer> prev = null;
        Node<Integer> nextPtr = null;
        Node<Integer> curr = getHead();

        while (curr != null) {
            nextPtr = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextPtr;
        }
        setHead(prev);
    }

    public void interchangeSortAsc() {
        for (Node<Integer> i = getHead(); i != null; i = i.getNext()) { // for (int i = 0; i < n - 1; i++)
            for (Node<Integer> j = i.getNext(); j != null; j = j.getNext()) { // for (int j = i + 1; j < n; j++)
                if (i.getData() > j.getData()) {
                    int temp = j.getData();
                    j.setData(i.getData());
                    i.setData(temp);
                }
            }
        }
    }
}