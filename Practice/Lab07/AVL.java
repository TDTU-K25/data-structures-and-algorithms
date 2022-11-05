public class AVL extends BST {

    public AVL() {
        super();
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private int checkBalance(Node x) {
        return height(x.left) - height(x.right);
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node balance(Node x) {
        if (checkBalance(x) < - 1) {
            if (checkBalance(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        }
        else if (checkBalance(x) > 1) {
            if (checkBalance(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }

    @Override
    protected Node insert(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = insert(x.left, key);
        } else if (cmp > 0) {
            x.right = insert(x.right, key);
        } else {
            x.key = key;
        }
		x.height = 1 + Math.max(height(x.left), height(x.right)); // update height
        return balance(x);
    }

    @Override
    protected Node delete(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }
            x.key = min(x.right).key;
            x.right = deleteMin(x.right);
        }
        x.height = 1 + Math.max(height(x.left), height(x.right)); // update height
        return balance(x);
    }

    @Override
    protected Node delete_pre(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete_pre(x.left, key);
        } else if (cmp > 0) {
            x.right = delete_pre(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }
            x.key = max(x.left).key;
            x.left = deleteMax(x.left);
        }
        x.height = 1 + Math.max(height(x.left), height(x.right)); // update height
        return balance(x);
    }
}