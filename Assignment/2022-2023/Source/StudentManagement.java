import java.util.*;

public class StudentManagement {
    private AVL tree;
    private Stack<Node> undoState;
    private Stack<Node> redoState;

    public StudentManagement() {
        this.tree = new AVL();
        this.undoState = new Stack<Node>();
        this.redoState = new Stack<Node>();
    }

    public AVL getTree() {
        return this.tree;
    }

    // Requirement 1
    public boolean addStudent(Student st) {
        // code here
        undoState.push(cloneAVLTree(tree.getRoot()));
        if (!tree.contain(st.getId())) {
            tree.insert(st);
            return true;
        } else {
            return false;
        }
    }

    // Requirement 2
    public Student searchStudentById(int id) {
        // code here
        if (tree.contain(id)) {
            return tree.search(id).getData();
        } else {
            return null;
        }
    }

    // Requirement 3
    public boolean removeStudent(int id) {
        // code here
        undoState.push(cloneAVLTree(tree.getRoot()));
        if (tree.contain(id)) {
            tree.delete(tree.search(id).getData());
            return true;
        } else {
            return false;
        }
    }

    // Requirement 4
    public void undo() {
        // code here
        try {
            redoState.push(cloneAVLTree(tree.getRoot()));
            tree.setRoot(undoState.pop());
        } catch (EmptyStackException e) {
            System.out.println("Can not undo");
        }
    }

    // Requirement 5
    public void redo() {
        // code here
        try {
            tree.setRoot(redoState.pop());
        } catch (EmptyStackException e) {
            System.out.println("Can not redo");
        }
    }

    // Requirement 6
    public ScoreAVL scoreTree(AVL tree) {
        // code here
        ScoreAVL scoreAVLTree = new ScoreAVL();

        // Like BFS for traversing graph (tree is graph)

        Queue<Node> queue = new LinkedList<Node>();

        // start from root
        queue.add(tree.getRoot());

        while (!queue.isEmpty()) {
            Node x = queue.poll();
            scoreAVLTree.insert(x.getData());

            // Find all neighbors of current x vertex and add into queue

            // level-order Binary Tree Traversal
            // => Priority left vertex of current x vertex first then right vertex of
            // current x vertex

            if (x.getLeft() != null) {
                queue.add(x.getLeft());
            }

            if (x.getRight() != null) {
                queue.add(x.getRight());
            }
        }

        return scoreAVLTree;
    }

    // ------------------Supported methods------------------

    private static Node cloneAVLTree(Node root) {
        if (root == null) {
            return null;
        }

        Node rootClone = new Node(root.getData());
        rootClone.setHeight(root.getHeight());
        rootClone.setLeft(cloneAVLTree(root.getLeft()));
        rootClone.setRight(cloneAVLTree(root.getRight()));
        return rootClone;
    }

}
