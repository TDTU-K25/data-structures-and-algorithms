import java.util.ArrayList;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	public void insert(Student student) {
		this.root = insert(this.root, student);
	}

	public Node findMaxId() {
		return findMaxId(this.root);
	}

	public double findAverage() {
		// code here
		return 0;
	}

	public ArrayList<Node> findStudentsByName(String name) {
		ArrayList<Node> result = new ArrayList<Node>();
		findStudentsByName(this.root, name, result);
		return result;
	}

	private Node insert(Node node, Student student) {
		// code here
		return null;
	}

	public Node findMaxId(Node node) {
		// code here
		return null;
	}

	public int findAverage(Node node) {
		// code here
		return 0;
	}

	private void findStudentsByName(Node node, String name, ArrayList<Node> students) {
		// code here
	}

}