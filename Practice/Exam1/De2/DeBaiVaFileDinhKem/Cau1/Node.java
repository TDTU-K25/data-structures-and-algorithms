public class Node{
	private int value;
	private Node next;
	
	public Node(int data, Node next){
		this.value = data;
		this.next = next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public Node getNext(){
		return this.next;
	}
}