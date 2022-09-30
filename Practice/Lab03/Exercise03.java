public class Exercise03 {

    public static boolean checkPrime(int n, int d) {
        if (n < 2) {
            return false;
        }

        if (n == d) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        return checkPrime(n, d + 1);
    }

    public static boolean checkPrime(int n) {
        return checkPrime(n, 2);
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(0));
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(6));
        System.out.println(checkPrime(7));
        System.out.println(checkPrime(11));
        System.out.println(checkPrime(15));
    }
}