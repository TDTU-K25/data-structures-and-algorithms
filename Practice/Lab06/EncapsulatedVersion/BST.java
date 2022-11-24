import java.util.NoSuchElementException;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    private Node insert(Node x, Integer key) {
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
            return x;
        }
    }

    public void insert(Integer key) {
        root = insert(root, key);
    }

    private void NLR(Node x) {
        if (x != null) {
            System.out.print(x.getKey() + " ");
            NLR(x.getLeft());
            NLR(x.getRight());
        }
    }

    public void NLR() {
        NLR(root);
    }

    private void LRN(Node x) {
        if (x != null) {
            LRN(x.getLeft());
            LRN(x.getRight());
            System.out.print(x.getKey() + " ");
        }
    }

    public void LRN() {
        LRN(root);
    }

    private void LNR(Node x) {
        if (x != null) {
            LNR(x.getLeft());
            System.out.print(x.getKey() + " ");
            LNR(x.getRight());
        }
    }

    public void LNR() {
        LNR(root);
    }

    private Node search(Node x, Integer key) {
        if (x == null) {
            return null;
        } else {
            int cmp = x.getKey().compareTo(key);
            if (cmp < 0) {
                return search(x.getRight(), key);
            } else if (cmp > 0) {
                return search(x.getLeft(), key);
            } else {
                return x;
            }
        }
    }

    public Node search(Integer key) {
        return search(root, key);
    }

    private Node min(Node x) {
        if (x.getLeft() == null) {
            return x;
        }
        return min(x.getLeft());
    }

    public Node min() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return min(root);
        }
    }

    private Node max(Node x) {
        if (x.getRight() == null) {
            return x;
        }
        return max(x.getRight());
    }

    public Node max() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return max(root);
        }
    }

    private Node deleteMin(Node x) {
        if (x.getLeft() == null) {
            return x.getRight();
        } else {
            x.setLeft(deleteMin(x.getLeft()));
            return x;
        }
    }

    public Node deleteMin() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return deleteMin(root);
        }
    }

    private Node delete(Node x, Integer key) {
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
            return x;
        }
    }

    public Node delete(Integer key) {
        return delete(root, key);
    }

    // Exercise 3
    public void printAsc() {
        LNR();
    }

    // Exercise 4
    private void RNL(Node x) { // In-order DESCENDING
        if (x != null) {
            RNL(x.getRight());
            System.out.print(x.getKey() + " ");
            RNL(x.getLeft());
        }
    }

    private void RNL() {
        RNL(root);
    }

    public void printDesc() {
        RNL();
    }

    // Exercise 5
    private boolean contains(Node x, Integer key) {
        if (x == null) {
            return false;
        } else {
            int cmp = x.getKey().compareTo(key);
            if (cmp < 0) {
                return contains(x.getRight(), key);
            } else if (cmp > 0) {
                return contains(x.getLeft(), key);
            } else {
                return true;
            }
        }
    }

    public boolean contains(Integer key) {
        return contains(root, key);
    }

    // Exercise 6
    private Node deleteMax(Node x) {
        if (x.getRight() == null) {
            return x.getLeft();
        } else {
            x.setRight(deleteMax(x.getRight()));
            return x;
        }
    }

    public Node deleteMax() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return deleteMax(root);
        }
    }

    // Exercise 7
    private Node delete_pre(Node x, Integer key) {
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
            return x;
        }
    }

    public void delete_pre(Integer key) {
        delete_pre(root, key);
    }

    // Exercise 8
    private int height(Node x) {
        if (x != null) {
            return Math.max(height(x.getLeft()), height(x.getRight())) + 1;
        }
        return 0;
    }

    public int height() {
        return height(root);
    }

    // Exercise 9
    public Integer sum(Node x) {
        if (x != null) {
            return x.getKey() + sum(x.getLeft()) + sum(x.getRight());
        }
        return 0;
    }

    // Exercise 10
    public Integer sum() {
        return sum(root);
    }
}