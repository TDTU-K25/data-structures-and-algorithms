public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        
        // System.out.println(list.isEmpty());

        // System.out.println(list.getFirst());

        // list.print();

        // System.out.println(list.size());

        list.addFirst("bb");
        list.print();

        list.addLast("aa");
        list.print();

        list.addFirst("cc");
        list.print();

        list.addAfter(list.getHead(), "ee");
        list.print();
        
        list.addAfter(list.getHead().getNext(), "pp");
        list.print();

        // System.out.println(list.contains("bb"));
        // System.out.println(list.contains("ff"));

        list.addLast("qq");
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