public class Exercise2 {
    public static double a(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }

    public static double recursive_a(int n) {
        if (n == 1) {
            return 2;
        }
        return Math.pow(2, n) + recursive_a(n - 1);
    }

    public static double b(int n) {
        double sum = 0;
        for (double x = 0; x <= n; x++) {
            sum += ((x + 1) / 2);
        }
        return sum;
    }

    public static double recursive_b(int n) {
        if (n == 0) {
            return 0.5;
        }
        return ((n + 1) / 2.0) + recursive_b(n - 1);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursive_factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursive_factorial(n - 1);
    }

    public static double c(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ((double) factorial(i) / factorial(i - 1));
        }
        return sum;
    }

    public static double recursive_c(int n) {
        if (n == 1) {
            return 1;
        }
        return ((double) recursive_factorial(n) / recursive_factorial(n - 1)) + recursive_c(n - 1);
    }

    public static int d(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum += (x * (x - 1));
        }
        return sum;
    }

    public static int recursive_d(int n) {
        if (n == 1) {
            return 0;
        }
        return (n * (n - 1)) + recursive_d(n - 1);
    }

    public static int e(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
            result *= x;
        }
        return result;
    }

    public static int recursive_e(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursive_e(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(a(5));
        System.out.println(recursive_a(5));

        System.out.println();

        System.out.println(b(5));
        System.out.println(recursive_b(5));

        System.out.println();

        System.out.println(c(5));
        System.out.println(recursive_c(5));

        System.out.println();

        System.out.println(d(5));
        System.out.println(recursive_d(5));

        System.out.println();

        System.out.println(e(5));
        System.out.println(recursive_e(5));
    }
}