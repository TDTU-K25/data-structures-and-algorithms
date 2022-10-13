public class Cau3 {

    public static boolean isSquareNumber(int num) {
        if ((int) Math.pow((int) Math.sqrt(num), 2) == num) {
            return true;
        }
        return false;
    }

    public static int countSquareNumber(int[] a, int k) {
        if (k < 0) {
            return 0;
        }
        if (isSquareNumber(a[k])) {
            return 1 + countSquareNumber(a, k - 1);
        }
        return countSquareNumber(a, k - 1);
    }

    public static void main(String[] args) {
        System.out.println(countSquareNumber(new int[] { 3, 1, 5, 4, 10, 25 }, 5));
    }
}