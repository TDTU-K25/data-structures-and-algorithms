public class Test {

    // Exercise 2
    public static BST createTree(String strKey) {
        BST tree = new BST();
        String[] keys = strKey.split(" ");
        for (String key : keys) {
            tree.insert(Integer.valueOf(key));
        }
        return tree;
    }

    public static void main(String[] args) {
        BST bst = createTree("100 200 90 65 75 55 60 270 220 190 180 185");

        bst.NLR();
        bst.LNR();
        bst.LRN();

        System.out.println(bst.search(185));
        System.out.println(bst.search(1000));

        System.out.println(bst.min().getKey());
        System.out.println(bst.max().getKey());

        bst.deleteMin();
        bst.deleteMax();

        bst.delete(185); // no child
        bst.delete(270); // one child
        bst.delete(200); // two child

        bst.printAsc();
        bst.printDesc();

        System.out.println(bst.contains(999));
        System.out.println(bst.contains(270));

        bst.delete_pre(185); // no child
        bst.delete_pre(270); // one child
        bst.delete_pre(200); // two child

        System.out.println(bst.height());

        System.out.println(bst.sum(bst.getRoot().getLeft()));
        System.out.println(bst.sum(bst.getRoot().getRight()));
        System.out.println(bst.sum());
    }
}