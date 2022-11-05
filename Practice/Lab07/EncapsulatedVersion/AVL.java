public class AVL extends BST {

    public AVL() {
        super();
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.getHeight();
    }

    private int checkBalance(Node x) {
        return height(x.getLeft()) - height(x.getRight());
    }

    private Node rotateLeft(Node x) {
        Node y = x.getRight();
        x.setRight(y.getLeft());
        y.setLeft(x);
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        return y;
    }

    private Node rotateRight(Node x) {
        Node y = x.getLeft();
        x.setLeft(y.getRight());
        y.setRight(x);
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        return y;
    }

    private Node balance(Node x) {
        if (checkBalance(x) < -1) {
            if (checkBalance(x.getRight()) > 0) {
                x.setRight(rotateRight(x.getRight()));
            }
            x = rotateLeft(x);
        } else if (checkBalance(x) > 1) {
            if (checkBalance(x.getLeft()) < 0) {
                x.setLeft(rotateLeft(x.getLeft()));
            }
            x = rotateRight(x);
        }
        return x;
    }

    protected Node insert(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        } else {
            int cmp = x.getKey().compareTo(key);

            if (cmp < 0) {
                x.setRight(insert(x.getRight(), key));
            } else if (cmp > 0) {
                x.setLeft(insert(x.getLeft(), key));
            } else {
                x.setKey(key);
            }
            x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
            return balance(x);
        }
    }

    protected Node delete(Node x, Integer key) {
        if (x == null) {
            return null;
        } else {
            int cmp = x.getKey().compareTo(key);
            if (cmp < 0) {
                x.setRight(delete(x.getRight(), key));
            } else if (cmp > 0) {
                x.setLeft(delete(x.getLeft(), key));
            } else {
                if (x.getLeft() == null) {
                    return x.getRight();
                }
                if (x.getRight() == null) {
                    return x.getLeft();
                }
                x.setKey(min(x.getRight()).getKey());
                x.setRight(deleteMin(x.getRight()));
            }
            x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
            return balance(x);
        }
    }

    protected Node delete_pre(Node x, Integer key) {
        if (x == null) {
            return null;
        } else {
            int cmp = x.getKey().compareTo(key);
            if (cmp < 0) {
                x.setRight(delete_pre(x.getRight(), key));
            } else if (cmp > 0) {
                x.setLeft(delete_pre(x.getLeft(), key));
            } else {
                if (x.getLeft() == null) {
                    return x.getRight();
                }
                if (x.getRight() == null) {
                    return x.getLeft();
                }
                x.setKey(max(x.getLeft()).getKey());
                x.setLeft(deleteMax(x.getLeft()));
            }
            x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
            return balance(x);
        }
    }
}