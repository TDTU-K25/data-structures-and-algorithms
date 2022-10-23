import java.util.NoSuchElementException;

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    private Node insert(Node x, Integer key) {
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

        return x;
    }

    public void insert(Integer key) {
        root = insert(root, key);
    }

    private void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    public void NLR() {
        NLR(root);
    }

    private void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    public void LNR() {
        LNR(root);
    }

    private void LRN(Node x) {
        if (x != null) {
            LRN(x.left);
            LRN(x.right);
            System.out.print(x.key + " ");
        }
    }

    public void LRN() {
        LRN(root);
    }

    private Node search(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return search(x.left, key);
        } else if (cmp > 0) {
            return search(x.right, key);
        } else {
            return x;
        }
    }

    public Node search(Integer key) {
        return search(root, key);
    }

    private Node min(Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }

    public Node min() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return min(root);
        }
    }

    private Node max(Node x) {
        if (x.right == null) {
            return x;
        }
        return max(x.right);
    }

    public Node max() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return max(root);
        }
    }

    private Node deleteMin(Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        return x;
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
        return x;
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
            RNL(x.right);
            System.out.print(x.key + " ");
            RNL(x.left);
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
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return contains(x.left, key);
        } else if (cmp > 0) {
            return contains(x.right, key);
        } else {
            return true;
        }
    }

    public boolean contains(Integer key) {
        return contains(root, key);
    }

    // Exercise 6
    private Node deleteMax(Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        return x;
    }

    public void deleteMax() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            deleteMax(root);
        }
    }

    // Exercise 7
    private Node delete_pre(Node x, Integer key) {
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
        return x;
    }

    public void delete_pre(Integer key) {
        delete_pre(root, key);
    }

    // Exercise 8
    private int height(Node x) {
        if (x != null) {
            int leftTreeHeight = height(x.left);
            int rightTreeHeight = height(x.right);

            return Math.max(leftTreeHeight, rightTreeHeight) + 1;
        }
        return 0;
    }

    public int height() {
        return height(root);
    }

    // Exercise 9
    public Integer sum(Node x) {
        if (x != null) {
            return x.key + sum(x.left) + sum(x.right);
        }
        return 0;
    }

    // Exercise 10
    public Integer sum() {
        return sum(root);
    }
}