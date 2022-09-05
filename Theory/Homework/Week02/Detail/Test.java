public class Test {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.add(5);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(3);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(7);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(2);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(1);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(9);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(4);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        list.add(2);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("Item was removed from the list is " + list.remove(7));
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("Item was removed from the list is " + list.remove(1));
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("Item was removed from the list is " + list.remove(9));
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("Item was removed from the list is " + list.remove(10));
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println();
    }

}