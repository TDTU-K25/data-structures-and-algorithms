public class TestSortedList {

	public static void main(String[] args) {
		SortedLinkedList<Integer> sl = new SortedLinkedList<Integer> ();
		sl.insert(5);
		sl.insert(4);
		sl.insert(10);
		sl.insert(2);
		sl.insert(3);
		sl.insert(1);
		sl.insert(8);
		sl.print();

		sl.printLL();
		sl.printRev();
	}
}
