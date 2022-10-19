public class Test {
	public static void print(IntLinkedList list) {
		Node tmp = list.getHead();
		if (tmp == null) {
			System.out.println("No item here");
		}
		System.out.print(tmp.getData());
		tmp = tmp.getNext();
		while (tmp != null) {
			System.out.print(" -> " + tmp.getData());
			tmp = tmp.getNext();
		}
	}

	public static void main(String[] args) {
		IntLinkedList ls = new IntLinkedList();
		ls.addFirst(7);
		ls.addFirst(5);
		ls.addFirst(6);
		ls.addFirst(1);
		print(ls);
		// System.out.println(ls.getHead().getData());
		// System.out.println(ls.positionOfFirstEven());
		// ls.removeLast();
		// print(ls);
	}
}