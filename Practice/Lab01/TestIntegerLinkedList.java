public class TestIntegerLinkedList {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

        list.addFirst(2);
        list.print();

        list.addFirst(3);
        list.print();

        list.addAfter(list.getHead().getNext(), 20);
        list.print();

        list.addLast(10);
        list.print();

        list.addFirst(1);
        list.print();

        list.addFirst(7);
        list.print();

        System.out.println("The number of even item in the list: " + list.countEven());
        System.out.println("The number of prime item in the list: " + list.countPrime());
        System.out.println("The maximum number in the list: " + list.maxItem());

        System.out.print("Reverse list: ");
        list.reverse();
        list.print();

        list.addBeforeFirstEvenItem(5);
        list.print();

        System.out.print("List after sort: ");
        list.interchangeSortAsc();
        list.print();
    }
}