public class Exercise02 {

    // (a) Compute factorial of n
    public static int recursive_factorial(int n) {
        if (n == 0)
            return 1;
        return n * recursive_factorial(n - 1);
    }

    // (b) Compute x**n
    public static int recursive_pow(int x, int n) {
        if (n == 0)
            return 1;
        return x * recursive_pow(x, n - 1);
    }

    // (c) Count the number of digits of a positive integer number
    public static int recursive_countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + recursive_countDigit(n / 10);
    }

    // (d) Find the Greatest Common Divisor (GCD) of 2 positive integer numbers
    // (Using Euclid algorithm)
    public static int recursive_gcd(int a, int b) {
        if (b == 0)
            return a;
        return recursive_gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(recursive_factorial(5));
        System.out.println(recursive_pow(3, 4));
        System.out.println(recursive_countDigit(12345));
        System.out.println(recursive_gcd(24, 16));
    }
}