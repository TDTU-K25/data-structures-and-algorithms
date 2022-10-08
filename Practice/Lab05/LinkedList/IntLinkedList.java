import java.util.NoSuchElementException;

public class IntLinkedList implements ListInterface {
    private Node head;

    public IntLinkedList() {
        head = null;
    }

    public void addFirst(int data) {
        head = new Node(data, head);
    }

    public boolean addLast(int data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node prev = null;
            Node temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    return false;
                }
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(new Node(data, null));
        }
        return true;
    }

    public boolean removeAt(int position) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }

        if (position > size || position <= 0) {
            return false;
        } else {
            Node prev = null;
            Node del = head;
            int current_position = 1;
            if (position == 1) { // removeFirst()
                head = head.getNext();
                return true;
            } else {
                while (del.getNext() != null) {
                    prev = del;
                    del = del.getNext();
                    current_position++;
                    if (current_position == position) {
                        prev.setNext(del.getNext());
                        break;
                    }
                }
                return true;
            }
        }
    }

    public int countOdd() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() % 2 != 0) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public int searchKey(int key) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.getData() == key) {
                return position;
            }
            position++;
            temp = temp.getNext();
        }
        return -1;
    }

    public boolean checkSorted() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }

        boolean isSorted = true;
        if (size == 0) {
            return !isSorted;
        } else if (size == 1) {
            return isSorted;
        } else {
            temp = head;
            if (temp.getData() < temp.getNext().getData()) { // ascending
                while (temp.getNext() != null) {
                    if (temp.getData() > temp.getNext().getData()) {
                        return !isSorted;
                    }
                    temp = temp.getNext();
                }
            } else { // descending
                while (temp.getNext() != null) {
                    if (temp.getData() < temp.getNext().getData()) {
                        return !isSorted;
                    }
                    temp = temp.getNext();
                }
            }
            return isSorted;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Empty list";
        } else {
            String result = "";
            Node temp = head;
            result = "List: " + temp.getData();
            while (temp.getNext() != null) {
                temp = temp.getNext();
                result += ", " + temp.getData();
            }
            result += "\n";
            return result;
        }
    }
}
