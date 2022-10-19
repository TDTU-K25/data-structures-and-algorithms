public class Cau2 {
    public static int recur(int[] a, int k) {
        if (k < 0) {
            return 0;
        }
        if (a[k] % 3 == 0) {
            return 1 + recur(a, k - 1);
        }
        return recur(a, k - 1);
    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 12, 5, 6, 3 };
        System.out.println(recur(a, a.length - 1));
        System.out.println(recur(new int[] { 3 }, 0));
        System.out.println(recur(new int[] { 0 }, 0));
        System.out.println(recur(new int[] { 2, 4, 6 }, 2));
        System.out.println(recur(new int[] { 2, 4 }, 1));
    }
}