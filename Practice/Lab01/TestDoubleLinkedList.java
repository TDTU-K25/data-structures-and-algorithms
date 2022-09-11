public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        
        // System.out.println(list.isEmpty());

        // System.out.println(list.getFirst());

        // list.print();

        // System.out.println(list.size());

        list.addFirst(5.3);
        list.print();

        list.addLast(2.6);
        list.print();

        list.addFirst(10.7);
        list.print();

        list.addAfter(list.getHead(), 3.1);
        list.print();
        
        list.addAfter(list.getHead().getNext(), 5.9);
        list.print();

        // System.out.println(list.contains(4.2));
        // System.out.println(list.contains(3.1));

        list.addLast(20.2);
        list.print();

        System.out.println(list.size());

        list.removeFirst();
        list.print();

        list.removeCurr(list.getHead());
        list.print();
        
        list.removeCurr(list.getHead().getNext());
        list.print();

        list.removeLast();
        list.print();

        System.out.println(list.size());
    }
}