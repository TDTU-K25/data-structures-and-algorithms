class SortedLinkedList <T extends Comparable<? super T>>  
                                               extends BasicLinkedList<T> {

	private ListNode<T> insert(ListNode<T> p, T v) {
		//System.out.println("inside insert(ListNode<T> p, T v)");
		if (p == null || v.compareTo((T) p.element) < 0) {
			return new ListNode<T>(v, p);
		} else {
			p.next = insert(p.next, v);
			return p;
		}
	}

	public void insert(T v) {
		head = insert(head, v);
		num_nodes++;  // need to do this one ourselves
	}

	public void printLL() {
		System.out.print("Sorted List in order: ");
		printLL(head);
		System.out.println();
	}

	private void printLL(ListNode<T> n) {
		if (n != null) {
			System.out.print(n.element + " ");
			printLL(n.next);
		}
	}

	public void printRev() {
		System.out.print("Sorted List in reversed order: ");
		printRev(head);
		System.out.println();
	}

	private void printRev(ListNode<T> n) {
		if (n != null) {
			printRev(n.next);
			System.out.print(n.element + " ");
		}
	}
}
