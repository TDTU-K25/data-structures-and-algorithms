public class Test {
        public static void main(String[] args) {
                ListInterface list = new IntLinkedList();

                System.out.println("----------- addFirst() ----------");

                list.addFirst(2);
                System.out.println(list);

                list.addFirst(4);
                System.out.println(list);

                list.addFirst(-1);
                System.out.println(list);

                list.addFirst(5);
                System.out.println(list);

                list.addFirst(1);
                System.out.println(list);

                list.addFirst(7);
                System.out.println(list);

                System.out.println("----------- addLast() ----------");

                System.out.println(list.addLast(3));
                System.out.println(list);

                System.out.println(list.addLast(8));
                System.out.println(list);

                System.out.println(list.addLast(5));
                System.out.println(list);

                System.out.println("----------- removeAt() ----------");

                System.out.println(list.removeAt(0));
                System.out.println(list);

                System.out.println(list.removeAt(1));
                System.out.println(list);

                System.out.println(list.removeAt(2));
                System.out.println(list);

                System.out.println(list.removeAt(6));
                System.out.println(list);

                System.out.println(list.removeAt(8));
                System.out.println(list);

                System.out.println("----------- countOdd() ----------");

                System.out.println(list);

                System.out.println(list.countOdd());

                System.out.println("----------- searchKey() ----------");

                System.out.println(list);

                System.out.println(list.searchKey(1));
                System.out.println(list.searchKey(4));
                System.out.println(list.searchKey(3));
                System.out.println(list.searchKey(10));

                System.out.println("----------- checkSorted() ----------");

                System.out.println(list);

                System.out.println(list.checkSorted());
        }
}
