import java.util.NoSuchElementException;

public class MyLinkedList implements ListInterface {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    @Override
    public void addFirst(int data) {
        head = new Node(data, head);
    }

    @Override
    public int getLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    @Override
    public int getSumEven() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() % 2 == 0) {
                sum += temp.getData();
            }
            temp = temp.getNext();
        }
        return sum;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        System.out.println(list.getLast());
        System.out.println(list.getSumEven());
    }
}