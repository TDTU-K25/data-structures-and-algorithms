import java.util.*;

public class DoubleLinkedList {
    private DoubleNode head;
    private int num_nodes;

    public DoubleLinkedList() {
        head = null;
        num_nodes = 0;
    }

    public DoubleNode getHead() {
        return head;
    }

    public int size() {
        return num_nodes;
    }

    public boolean isEmpty() {
        return (num_nodes == 0);
    }

    public void addFirst(double item) {
        head = new DoubleNode(item, head);
        num_nodes++;
    }

    public double removeFirst() throws NoSuchElementException {
        double temp;
        if (head == null) {
            throw new NoSuchElementException("Nothing to remove");
        } else {
            temp = head.getData();
            head = head.getNext();
            num_nodes--;
            return temp;
        }
    }

    public boolean contains(double item) {
        DoubleNode temp = head;
        while (temp != null) {
            if (temp.getData() == item) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void print() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Nothing to print");
        } else {
            DoubleNode temp = head;
            System.out.print(temp.getData());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(", " + temp.getData());
            }
            System.out.println();
        }
    }

    public double getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Nothing to get");
        } else {
            return head.getData();
        }
    }

    public double getLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Nothing to get");
        } else {
            DoubleNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    public void addAfter(DoubleNode curr, double item) {
        if (curr != null) {
            curr.setNext(new DoubleNode(item, curr.getNext()));
            num_nodes++;
        } else { // curr == null, assume we want to add first
            addFirst(item);
        }
    }

    public double removeAfter(DoubleNode curr) throws NoSuchElementException {
        double temp;
        if (curr != null) {
            DoubleNode nextPtr = curr.getNext();
            if (nextPtr != null) {
                temp = nextPtr.getData();
                curr.setNext(nextPtr.getNext());
                num_nodes--;
                return temp;
            } else {
                throw new NoSuchElementException("No node to remove");
            }
        } else { // curr == null, assume we want to remove first
            return removeFirst();
        }
    }

    public void addLast(double item) {
        if (head != null) {
            DoubleNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new DoubleNode(item));
            num_nodes++;
        } else {
            addFirst(item);
        }
    }

    public double removeLast() throws NoSuchElementException {
        double temp;
        if (head != null) {
            DoubleNode prev = null;
            DoubleNode curr = head;
            if (curr.getNext() == null) { // list just has one Node => removeFirst();
                return removeFirst();
            } else {
                while (curr.getNext() != null) {
                    prev = curr;
                    curr = curr.getNext();
                }
                temp = curr.getData();
                prev.setNext(curr.getNext());
                num_nodes--;
                return temp;
            }
        } else {
            throw new NoSuchElementException("Nothing to remove");
        }
    }

    public double removeCurr(DoubleNode curr) throws NoSuchElementException, IllegalArgumentException {
        double temp;
        if (curr == null) {
            throw new IllegalArgumentException();
        } else {
            if (head != null) {
                if (curr == head) { // Case 1: removeFirst()
                    return removeFirst();
                } else { // Case 2
                    DoubleNode prev = null;
                    DoubleNode del = head;
                    while (del.getNext() != null) {
                        prev = del;
                        del = del.getNext();
                        if (del == curr) {
                            break;
                        }
                    }
                    temp = del.getData();
                    prev.setNext(del.getNext());
                    num_nodes--;
                    return temp;
                }
            } else {
                throw new NoSuchElementException("Nothing to remove");
            }
        }
    }
}