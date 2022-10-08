public class Exercise3 {

    public static double recursive_a(int n) {
        if (n == 0) {
            return 2;
        }
        return 2 - 0.5 * recursive_a(n - 1);
    }

    public static int recursive_b(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + recursive_b(n / 10);
    }

    public static int recursive_c(int n, int k) {
        if (k == 1) {
            return n;
        }
        return n + recursive_c(n, k - 1);
    }

    public static int recursive_d(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return recursive_d(n - 1) + recursive_d(n - 2);
    }

    public static double a(int n) {
        double result = 2; // n = 0
        for (int i = 1; i <= n; i++) { // n > 0
            result = 2 - (result / 2);
        }
        return result;
    }

    public static int b(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int c(int n, int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += n;
        }
        return sum;
    }

    public static int d(int n) {
        if (n == 0) { // F(0)
            return 0;
        } else if (n == 1) { // F(1)
            return 1;
        } else { // F(2), F(3), ...
            int prev1 = 0;
            int prev2 = 1;
            int curr = 0;
            for (int i = 2; i <= n; i++) {
                curr = prev1 + prev2;
                prev1 = prev2;
                prev2 = curr;
            }
            return curr;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive_a(3));
        System.out.println(recursive_b(123));
        System.out.println(recursive_c(5, 4));
        System.out.println(recursive_d(10));

        System.out.println();

        System.out.println(a(3));
        System.out.println(b(123));
        System.out.println(c(5, 4));
        System.out.println(d(10));
    }
}