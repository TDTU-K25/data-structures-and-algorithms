public class Node {
	private int data;
	private Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node() {
		this.data = 0;
		this.next = null;
	}

	public int getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}