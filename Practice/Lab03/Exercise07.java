public class Exercise07 {

    // (a) Find and return the minimum element in an array. The array and its size
    // are given as parameters
    public static int minElement(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], minElement(arr, n - 1));
    }

    // (b) Compute and return the sum of all elements in an array. The array and its
    // size are given as parameters
    public static int sumAllElements(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + sumAllElements(arr, n - 1);
    }

    // (c) Count how many even numbers are there in an array. The array and its size
    // are given as parameters
    public static int countEvenElements(int[] arr, int n) {
        if (n == 1) {
            if (arr[0] % 2 == 0) {
                return 1;
            }
            return 0;
        }

        if (arr[n - 1] % 2 == 0) {
            return 1 + countEvenElements(arr, n - 1);
        } else {
            return 0 + countEvenElements(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(minElement(new int[] { 10, 9, 5, 2, 3, 8 }, 6));
        System.out.println(sumAllElements(new int[] { 10, 9, 5, 2, 3, 8 }, 6));
        System.out.println(countEvenElements(new int[] { 10, 9, 5, 2, 3, 8 }, 6));
    }
}