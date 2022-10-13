public class Test {

    public static void print(ListInterface ls) {
        Node tmp = ls.getHead();
        System.out.print(tmp.getValue());
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            System.out.print(" -> " + tmp.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntLinkedList ls = new IntLinkedList();
        ls.addFirst(1);
        ls.addFirst(2);
        print(ls);

        ls.addLast(1);
        ls.addLast(2);
        ls.addLast(5);
        ls.addLast(6);
        print(ls);

        System.out.println(ls.addLast(3));
        print(ls);

        System.out.println(ls.addLast(2));
        print(ls);

        System.out.println(ls.getHead().getValue());
        System.out.println(ls.sumEven());
    }
}