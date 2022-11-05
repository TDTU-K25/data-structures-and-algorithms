public class Test {

    public static AVL createAVLTree(String strKey) {
        AVL tree = new AVL();
        String[] keys = strKey.split(" ");
        for (String key : keys) {
            tree.insert(Integer.valueOf(key));
        }
        return tree;
    }

    public static void main(String[] args) {
        AVL avl = createAVLTree("33 96 14 29 78 94 34 42 93 99");

        avl.NLR();

        System.out.println();

        avl.delete(33);
        avl.NLR();
    }
}