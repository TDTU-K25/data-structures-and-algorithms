public class Exercise1 {

    public static double prod_recur(int a, int b) {
        if (a > 0 && b < 0) {
            return prod_recur(b, a);
        }
        if (a < 0 && b < 0) {
            return prod_recur(-a, -b);
        }
        if (b == 1) {
            return a;
        }
        return a + prod_recur(a, b - 1);
    }

    public static double bin2dec(int n, int exp) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 0) {
            return bin2dec(n / 10, exp + 1);
        }
        return Math.pow(2, exp) + bin2dec(n / 10, exp + 1);
    }

    public static int maxDigit(int n) {
        if (n < 10) {
            return n;
        }
        return Math.max(n % 10, maxDigit(n / 10));
    }

    public static int maxElement(int[] a, int n) {
        if (n == 0) {
            return a[0];
        }
        return Math.max(a[n], maxElement(a, n - 1));
    }

    public static int search(int[] a, int n, int key) {
        if (n < 0) {
            return -1;
        }
        if (a[n] == key) {
            return n;
        }
        return search(a, n - 1, key);
    }

    public static void main(String[] args) {
        System.out.println(prod_recur(3, 4));
        System.out.println(prod_recur(5, -4));
        System.out.println(prod_recur(-5, 4));
        System.out.println(prod_recur(-5, -4));
        System.out.println(prod_recur(4, -5));

        System.out.println();

        System.out.println(bin2dec(1010, 0));
        System.out.println(bin2dec(1111, 0));

        System.out.println();

        System.out.println(maxDigit(358));
        System.out.println(maxDigit(795));
        System.out.println(maxDigit(752));

        System.out.println();

        System.out.println(maxElement(new int[] { 2, 5, 10, 3, 1, 21 }, 5));
        System.out.println(maxElement(new int[] { 21, 5, 10, 3, 6, 2 }, 5));
        System.out.println(maxElement(new int[] { 10, 1, 21, 3, 2, 5 }, 5));

        System.out.println();

        System.out.println(search(new int[] { 2, 1, 10, 3, 5, 21 }, 5, 2));
        System.out.println(search(new int[] { 2, 1, 10, 3, 5, 21 }, 5, 3));
        System.out.println(search(new int[] { 2, 1, 10, 3, 5, 21 }, 5, 21));
        System.out.println(search(new int[] { 2, 1, 10, 3, 5, 21 }, 5, 7));
    }
}