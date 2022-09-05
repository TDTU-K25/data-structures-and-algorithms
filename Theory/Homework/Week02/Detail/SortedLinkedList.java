import java.util.*;

public class SortedLinkedList {
    private Node head;
    private int num_nodes;

    public SortedLinkedList() {
        this.head = null;
        this.num_nodes = 0;
    }

    public int size() {
        return this.num_nodes;
    }

    public void add(Integer item) {
        if (this.head != null) {
            if (this.head.getData() >= item) { // Case 1: if the value of the first node (head)
                                               // is greater than or equal the value of the item
                                               // => Add the node containing the item BEFORE the first node (head)
                                               // addFirst()
                head = new Node(item, head);
                num_nodes++;
            } else { // Case 2
                Node prev = head;
                Node current = head.getNext(); // Start from the Node after head node
                                               // because we have considered the head node from the above case 
                while (current != null) {
                    if (item < current.getData()) {  
                        prev.setNext(new Node(item, prev.getNext()));
                        // Node p = new Node(item);
                        // p.setNext(prev.getNext());
                        // prev.setNext(p);
                        num_nodes++;
                        return;
                    }
                    prev = current; // Save the previous node
                    current = current.getNext();
                }
                // Case 3: If there isn't any element in the list that is greater than item =>
                // Insert item into the end of the list
                prev.setNext(new Node(item, null)); // In this case, prev is the last node of the list
                // Node p = new Node(item);
                // p.setNext(null);
                // prev.setNext(p);
                num_nodes++;
            }
        } else { // List is empty => Insert item at the front of the list (addFirst)
            head = new Node(item, head);
            num_nodes++;
        }
    }

    public Integer removeFirst() throws NoSuchElementException {
        Node n;
        if (this.head == null) {
            throw new NoSuchElementException("Can't remove from empty list");
        } else {
            n = head;
            head = head.getNext();
            num_nodes--;
            return n.getData();
        }
    }

    public Integer removeAfter(Node current) throws NoSuchElementException {
        Node n;
        if (current != null) {
            Node nextPtr = current.getNext();
            if (nextPtr != null) {
                n = nextPtr;
                current.setNext(nextPtr.getNext());
                num_nodes--;
                return n.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        } else { // if current is null, assume we want to remove the first node (head)
            if (this.head != null) {
                return removeFirst();
            }
            throw new NoSuchElementException("Can't remove from empty list");
        }
    }

    public Integer remove(Integer item) throws NoSuchElementException {
        if (this.head != null) {
            if (this.head.getData().equals(item)) {
                return removeFirst();
            } else {
                Node prev = head;
                Node current = head.getNext(); // Start from the Node after head node
                                               // because we have considered the head node from the above case 
                while (current != null) {
                    if (current.getData().equals(item)) {
                        return removeAfter(prev);
                    }
                    prev = current; // Save the previous node
                    current = current.getNext();
                }
                throw new NoSuchElementException("Item not found");
            }
        } else {
            throw new NoSuchElementException("Can't remove from empty list");
        }
    }

    public void print() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException("Nothing to print...");

        Node ln = head;
        System.out.print("List is: " + ln.getData());
        while (ln.getNext() != null) {
            ln = ln.getNext();
            System.out.print(", " + ln.getData());
        }
        System.out.println(".");
    }
}
