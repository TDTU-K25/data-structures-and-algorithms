public class TestSortedLinkedList {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.addSortedLinkedList(2);
        list.print();
        
        list.addSortedLinkedList(1);
        list.print();

        list.addSortedLinkedList(3);
        list.print();

        list.addSortedLinkedList(5);
        list.print();

        list.addSortedLinkedList(4);
        list.print();

        list.addSortedLinkedList(7);
        list.print();

        list.addSortedLinkedList(9);
        list.print();

        list.addSortedLinkedList(6);
        list.print();

        System.out.println(list.countEvenNumbers(list.getHead()));

        System.out.println(list.sumAllNumbers(list.getHead()));
    }
}
