public class Exercise01 {
    // (a) Compute factorial of n
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // (b) Compute x**n
    public static int pow(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    // (c) Count the number of digits of a positive integer number
    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // (d) Check an positive integer number is prime or not
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // (e) Find the Greatest Common Divisor (GCD) of 2 positive integer numbers
    // (Using Euclid algorithm)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(pow(3, 4));
        System.out.println(countDigit(12345));
        System.out.println(isPrime(6));
        System.out.println(isPrime(5));
        System.out.println(gcd(24, 16));
    }
}