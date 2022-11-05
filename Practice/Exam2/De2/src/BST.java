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
		return (double) findAverage(this.root) / size(this.root);
	}

	public ArrayList<Node> findStudentsByName(String name) {
		ArrayList<Node> result = new ArrayList<Node>();
		findStudentsByName(this.root, name, result);
		return result;
	}

	private Node insert(Node node, Student student) {
		if (node == null) {
			return new Node(student);
		}
		if (student.getId() < node.getStudent().getId()) {
			node.setLeft(insert(node.getLeft(), student));
		} else {
			node.setRight(insert(node.getRight(), student));
		}
		return node;
	}

	public Node findMaxId(Node node) {
		// code here
		if (node.getRight() == null) {
			return node;
		}
		return findMaxId(node.getRight());
	}

	public int findAverage(Node node) {
		if (node != null) {
			return node.getStudent().getScore() + findAverage(node.getLeft()) + findAverage(node.getRight());
		}
		return 0;
	}

	private int size(Node node) {
		if (node != null) {
			return 1 + size(node.getLeft()) + size(node.getRight());
		}
		return 0;
	}

	private void findStudentsByName(Node node, String name, ArrayList<Node> students) {
		// code here
		if (node != null) {
			if (node.getStudent().getName().equals(name)) {
				students.add(node);
			}
			findStudentsByName(node.getLeft(), name, students);
			findStudentsByName(node.getRight(), name, students);
		}
	}

}