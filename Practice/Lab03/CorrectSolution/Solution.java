public class Solution {

    // Compute 2**n
    public static int pow_2_n(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * pow_2_n(n - 1);
    }

    // Exercise 2
    // (c) Count the number of digits of a positive integer number
    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    // Exercise 3
    public static boolean checkPrime(int n, int d) {
        if (n < 2)
            return false;
        if (n == 2) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        if (n - 1 == d) {
            return true;
        }

        return checkPrime(n, d + 1);
    }

    // Exercise 4
    public static int ex4_a(int n) {
        if (n == 1)
            return 3;
        return (2 * n + 1) + ex4_a(n - 1);
    }

    public static int ex4_d(int n, int r) {
        if (n >= r && r > 0) {
            return (n - r + 1) * ex4_d(n, r - 1);
        } else
            return 1;
    }

    // Exercise 5
    public static int dec2bin(int n) {
        if (n == 0)
            return 0;
        return n % 2 + dec2bin(n / 2) * 10;
    }

    // Exercise 7
    public static int minElement(int[] a, int k) {
        if (k == 0)
            return a[0];
        return a[k] < minElement(a, k - 1) ? a[k] : minElement(a, k - 1);
    }

    public static int sum(int[] a, int k) {
        if (k == 0) {
            return a[0];
        }
        return a[k] + sum(a, k - 1);
    }

    public static int countEven(int[] a, int k) {
        if (k < 0) {
            return 0;
        }
        if (a[k] % 2 == 0) {
            return 1 + countEven(a, k - 1);
        }
        return countEven(a, k - 1);
    }

    // Exercise 8
    /*
    public void addSortedLinkedList(Integer key) {
        head = addSortedLinkedList(head, key);
    }

    private Node<Integer> addSortedLinkedList(Node<Integer> temp, Integer key) {
        
    }

    public int countEven(Node<Integer> tmp) {
        if (tmp == null) {
            return 0;
        }
        if (tmp.getData() % 2 == 0) {
            return 1 + countEven(tmp.getNext());
        }
        return countEven(tmp.getNext());
    }
    */

    public static void main(String[] args) {
        // Exericise 2c
        System.out.println("Exercise 2c");
        System.out.println(countDigits(12345));

        System.out.println();

        // Exercise 3
        System.out.println("Exercise 3");
        System.out.println(checkPrime(0, 2));
        System.out.println(checkPrime(1, 2));
        System.out.println(checkPrime(2, 2));
        System.out.println(checkPrime(5, 2));
        System.out.println(checkPrime(6, 2));
        System.out.println(checkPrime(7, 2));
        System.out.println(checkPrime(11, 2));
        System.out.println(checkPrime(15, 2));

        System.out.println();

        // Exercise 4
        System.out.println(ex4_a(6));
        System.out.println(ex4_d(6, 3));

        System.out.println();

        // Exercise 5
        System.out.println(dec2bin(8));
        System.out.println(dec2bin(10));

        System.out.println();

        // Exercise 7
        System.out.println("Exercise 7");
        System.out.println(minElement(new int[] { 10, 9, 5, 2, 3, 8 }, 6 - 1));
        System.out.println(sum(new int[] { 10, 9, 5, 2, 3, 8 }, 6 - 1));
        System.out.println(countEven(new int[] { 10, 9, 5, 2, 3, 8 }, 6 - 1));
    }
}