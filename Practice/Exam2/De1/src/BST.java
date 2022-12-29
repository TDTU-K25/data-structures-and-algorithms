import java.util.ArrayList;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	public void insert(Package pkg) {
		this.root = insert(this.root, pkg);
	}

	public Node findMin() {
		return findMin(this.root);
	}

	public int totallyCountry(String country) {
		return totallyCountry(this.root, country);
	}

	public ArrayList<Node> findCountriesByPrice(int price) {
		ArrayList<Node> result = new ArrayList<Node>();
		findCountriesByPrice(this.root, price, result);
		return result;
	}

	private Node insert(Node node, Package pkg) {
		if (node == null) {
			return new Node(pkg);
		}
		if (pkg.getPrice() < node.getPackage().getPrice()) {
			node.setLeft(insert(node.getLeft(), pkg));
		} else {
			node.setRight(insert(node.getRight(), pkg));
		}
		return node;
	}

	private Node findMin(Node node) {
		if (node.getLeft() == null) {
			return node;
		}
		return findMin(node.getLeft());
	}

	private int totallyCountry(Node node, String country) {
		if (node != null) {
			if (node.getPackage().getCountry().equals(country)) {
				return node.getPackage().getPrice() + totallyCountry(node.getLeft(), country)
						+ totallyCountry(node.getRight(), country);
			} else {
				return totallyCountry(node.getLeft(), country) + totallyCountry(node.getRight(), country);
			}
		}
		return 0;
	}

	private void findCountriesByPrice(Node node, int price, ArrayList<Node> packages) {
		// code here
		if (node != null) {
			if (node.getPackage().getPrice() == price) {
				packages.add(node);
			}
			findCountriesByPrice(node.getLeft(), price, packages);
			findCountriesByPrice(node.getRight(), price, packages);
		}
	}
}