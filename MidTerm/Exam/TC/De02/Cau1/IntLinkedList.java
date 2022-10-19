public class IntLinkedList implements ListInterface {
    private Node head;

    public IntLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void addFirst(int data) {
        this.head = new Node(data, head);
    }

    public boolean addLast(int data) {
        if (head == null) {
            addFirst(data);
            return true;
        } else {
            Node prev = null;
            Node temp = head;
            while (temp != null) {
                if (temp.getValue() == data) {
                    return false;
                }
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(new Node(data, null));
            return true;
        }
    }

    public int sumEven() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() % 2 == 0 && temp.getValue() > 0) {
                sum += temp.getValue();
            }
            temp = temp.getNext();
        }
        return sum;
    }
}