public class Exercise06 {
    // (a) Find and return the minimum element in an array. The array and its size
    // are given as parameters
    public static int minElement(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // (b) Compute and return the sum of all elements in an array. The array and its
    // size are given as parameters
    public static int sumAllElements(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // (c) Count how many even numbers are there in an array. The array and its size
    // are given as parameters
    public static int countEvenElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minElement(new int[] { 5, 9, 0, 4, 1, 10 }, 6));
        System.out.println(sumAllElements(new int[] { 5, 9, 0, 4, 1, 10 }, 6));
        System.out.println(countEvenElements(new int[] { 5, 9, 0, 4, 1, 10 }, 6));
    }
}