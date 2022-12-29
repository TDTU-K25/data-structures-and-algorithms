public class Node {
    private Package pkg;
    private Node left;
    private Node right;

    public Node(Package pkg) {
        this.pkg = pkg;
        this.left = null;
        this.right = null;
    }

    public Package getPackage() {
        return pkg;
    }

    public void setPackage(Package pkg) {
        this.pkg = pkg;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}