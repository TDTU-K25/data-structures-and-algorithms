public class IntLinkedList implements ListInterface {
    private Node head;

    public IntLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void addFirst(int data) {
        head = new Node(data, head);
    }

    public boolean removeLast() {
        if (head == null) {
            return false;
        } else {
            if (head.getNext() == null) {
                head = head.getNext();
            } else {
                Node prev = head;
                Node curr = head.getNext();
                while (curr.getNext() != null) {
                    prev = curr;
                    curr = curr.getNext();
                }
                prev.setNext(curr.getNext());
            }
            return true;
        }
    }

    public int positionOfFirstEven() {
        int position = -1;
        if (head == null) {
            return position;
        } else {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.getData() % 2 == 0) {
                    position = index;
                    break;
                }
                temp = temp.getNext();
                index++;
            }
            return position;
        }
    }
}