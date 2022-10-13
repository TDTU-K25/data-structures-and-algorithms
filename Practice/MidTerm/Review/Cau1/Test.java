public class Test {
    public static void main(String[] args) {
        CharLinkedList list = new CharLinkedList();
        list.addFirst('c');
        list.addFirst('b');
        list.addFirst('A');
        System.out.println(list);
        System.out.println(list.getHead().getData());
        System.out.println(list.addAfterFirstKey('E', 'b'));
        System.out.println(list);
        System.out.println(list.largestCharPosition());
    }
}