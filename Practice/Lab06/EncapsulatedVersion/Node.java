public class Node {
    private Integer key;
    private Node left;
    private Node right;

    public Node(Integer key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Integer getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}