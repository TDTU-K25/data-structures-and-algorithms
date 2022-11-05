public class Node {
    Integer key;
    Node left;
    Node right;
    int height;

    public Node(Integer key) {
        this.key = key;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
}