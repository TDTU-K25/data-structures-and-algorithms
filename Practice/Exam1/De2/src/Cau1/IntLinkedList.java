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

    public boolean addAfterKey(int value, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() == key) {
                temp.setNext(new Node(value, temp.getNext()));
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int countElementGreaterThan(int value) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() > value) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public String toString() {
        if (head == null) {
            return "Empty list";
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