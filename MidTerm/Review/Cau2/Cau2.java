public class Cau2 {
    public static int recur(int n, int k) {
        // code here
        if (k == 0) {
            return 1;
        }
        return n * recur(n, k - 1);
    }

    public static void main(String args[]) {
        System.out.println(recur(5, 3));
        System.out.println(recur(0, 0));
        System.out.println(recur(5, 0));
        System.out.println(recur(0, 5));
    }
}