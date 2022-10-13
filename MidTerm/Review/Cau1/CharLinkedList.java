public class CharLinkedList implements ListInterface {
    private Node head;

    public CharLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void addFirst(char data) {
        head = new Node(data, head);
    }

    public boolean addAfterFirstKey(char data, char key) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == key) {
                temp.setNext(new Node(data, temp.getNext()));
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int largestCharPosition() {
        if (head != null) {
            int position = 0;
            int i = 0;
            Node temp = head;
            char largestChar = temp.getData();
            while (temp != null) {
                if (temp.getData() > largestChar) {
                    position = i;
                    largestChar = temp.getData();
                }
                i++;
                temp = temp.getNext();
            }
            return position;
        } else {
            return -1;
        }
    }

    public String toString() {
        if (head == null) {
            return "Empty list";
        } else {
            String result = "";
            Node temp = head;
            result += "List: " + temp.getData();
            while (temp.getNext() != null) {
                temp = temp.getNext();
                result += ", " + temp.getData();
            }
            result += "\n";
            return result;
        }
    }
}