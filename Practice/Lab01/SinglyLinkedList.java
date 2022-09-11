import java.util.*;

public class SinglyLinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int num_nodes;

    public SinglyLinkedList() {
        head = null;
        num_nodes = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public int size() {
        return num_nodes;
    }

    public boolean isEmpty() {
        return (num_nodes == 0);
    }

    public void addFirst(E item) {
        head = new Node<E>(item, head);
        num_nodes++;
    }

    public E removeFirst() throws NoSuchElementException {
        E temp;
        if (head == null) {
            throw new NoSuchElementException("Nothing to remove");
        } else {
            temp = head.getData();
            head = head.getNext();
            num_nodes--;
            return temp;
        }
    }

    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Nothing to get");
        } else {
            return head.getData();
        }
    }

    public void print() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Nothing to print");
        } else {
            Node<E> temp = head;
            System.out.print(temp.getData());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(", " + temp.getData());
            }
            System.out.println();
        }
    }

    public boolean contains(E item) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.getData().equals(item)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void addAfter(Node<E> curr, E item) {
        if (curr != null) {
            curr.setNext(new Node<E>(item, curr.getNext()));
        } else { // curr == null, assume we want to add first
            head = new Node<E>(item, head);
        }
        num_nodes++;
    }

    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        E temp;
        if (curr != null) {
            Node<E> nextPtr = curr.getNext();
            if (nextPtr != null) {
                temp = nextPtr.getData();
                curr.setNext(nextPtr.getNext());
                num_nodes--;
                return temp;
            } else {
                throw new NoSuchElementException("No node to remove");
            }
        } else { // curr == null, assume we want to remove first
            if (head != null) {
                temp = head.getData();
                head = head.getNext();
                num_nodes--;
                return temp;
            } else {
                throw new NoSuchElementException("Nothing to remove");
            }
        }
    }

    public void addLast(E item) {
        if (head != null) {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<E>(item));
        } else {
            head = new Node<E>(item, head);
        }
        num_nodes++;
    }

    public E removeLast() throws NoSuchElementException {
        E temp;
        if (head != null) {
            Node<E> prev = null;
            Node<E> curr = head;
            if (curr.getNext() == null) { // list just has one Node => removeFirst()
                temp = head.getData();
                head = head.getNext();
                num_nodes--;
                return temp;
            } else {
                while (curr.getNext() != null) {
                    prev = curr;
                    curr = curr.getNext();
                }
                temp = curr.getData();
                prev.setNext(curr.getNext()); // prev.setNext(null);
                num_nodes--;
                return temp;
            }
        } else {
            throw new NoSuchElementException("Nothing to remove");
        }
    }

    public E removeCurr(Node<E> curr) throws NoSuchElementException, IllegalArgumentException {
        E temp;
        if (curr == null) {
            throw new IllegalArgumentException();
        } else {
            if (head != null) {
                if (curr == head) { // Case 1: remove the head
                    temp = head.getData();
                    head = head.getNext();
                    num_nodes--;
                    return temp;
                } else { // Case 2
                    Node<E> prev = null;
                    Node<E> del = head;
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