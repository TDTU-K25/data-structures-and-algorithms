public class Test{	
	public static void main(String[] args){
		LinkedListInterface list = new IntLinkedList();
		list.addFirst(2);
		list.addFirst(4);
		list.addFirst(-1);
		list.addFirst(5);
		list.addFirst(1);
		list.addFirst(7);
		System.out.println(list);
		System.out.println(list.addAfterKey(3, 4));
		System.out.println(list);
		System.out.println(list.countElementGreaterThan(4));		
	}
}