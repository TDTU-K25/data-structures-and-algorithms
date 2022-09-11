public class TestFractionLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Fraction> list = new SinglyLinkedList<Fraction>();
        
        // System.out.println(list.isEmpty());

        // System.out.println(list.getFirst());

        // list.print();

        // System.out.println(list.size());

        list.addFirst(new Fraction(1, 3));
        list.print();

        list.addLast(new Fraction(3, 2));
        list.print();

        list.addFirst(new Fraction(9, 5));
        list.print();

        list.addAfter(list.getHead(), new Fraction(21, 6));
        list.print();
        
        list.addAfter(list.getHead().getNext(), new Fraction(7, 8));
        list.print();

        System.out.println(list.contains(new Fraction(9, 5)));
        System.out.println(list.contains(new Fraction(15, 4)));

        list.addLast(new Fraction(19, 26));
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
