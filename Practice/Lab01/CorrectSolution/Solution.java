public class Solution {

    // Exercise 2
    public E removeCur(Node<E> curr) throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            if (curr == null) {
                // ...
            } else {
                if (head == curr) {
                    return removeFirst();
                }
                Node<E> tmp = head;
                while (tmp.getNext() != curr) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(curr.getNext());
                num_nodes--;
                return tmp.getData();
            }
        }
    }

    // Exercise 3a

    // Composition
    public class IntLinkedList {
        private MyLinkedList<Integer> list;
        // ...
    }

    // Inheritance
    public class IntLinkedList extends MyLinkedList<Integer> {
        public int countEven() {
            int count = 0;
            Node<Integer> tmp = getHead();
            while (tmp != null) {
                if (tmp.getData() % 2 == 0) {
                    count++;
                }
                tmp = tmp.getNext();
            }
            return count;
        }
    }

}