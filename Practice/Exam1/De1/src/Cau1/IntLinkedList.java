import java.util.NoSuchElementException;

public class IntLinkedList implements LinkedListInterface {
    private Node head;

    public IntLinkedList() {
        head = null;
    }

    public boolean addFirst(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                return false;
            }
            temp = temp.getNext();
        }
        head = new Node(value, head);
        return true;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void removeFifthElement() throws NoSuchElementException {
        if (size() < 5) {
            throw new NoSuchElementException();
        } else {
            Node prev = null;
            Node del = head;
            int kth_element = 1;

            while (del.getNext() != null) {
                prev = del;
                del = del.getNext();
                kth_element++;
                if (kth_element == 5) {
                    prev.setNext(del.getNext());
                    break;
                }
            }
        }
    }

    public int lastEvenPosition() {
        int idx = 0;
        int lastEvenPosition = -1;
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() % 2 == 0) {
                lastEvenPosition = idx;
            }
            idx++;
            temp = temp.getNext();
        }
        return lastEvenPosition;
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        } else {
            Node temp = head;
            String result = "List: " + temp.getValue();
            while (temp.getNext() != null) {
                temp = temp.getNext();
                result += ", " + temp.getValue();
            }
            result += "\n";
            return result;
        }
    }
}