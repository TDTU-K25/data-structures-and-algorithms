public class Exercise04 {

    public static int a(int n) {
        if (n == 1) {
            return 3;
        }
        return (2 * n + 1) + a(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int b(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) + b(n - 1);
    }

    public static int c(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) * c(n - 1);
    }

    public static int d(int n, int r) {
        if (n >= r && r > 0) {
            return (n - r + 1) * d(n, r - 1);
        }
        return 1;
    }

    public static double e(int n) {
        if (n == 1)
            return 3;
        return Math.pow(2, n) + Math.pow(n, 2) + e(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(a(6));
        System.out.println(b(6));
        System.out.println(c(5));
        System.out.println(d(6, 3));
        System.out.println(e(5));
    }
}