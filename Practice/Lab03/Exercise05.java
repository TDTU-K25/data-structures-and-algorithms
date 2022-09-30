public class Exercise05 {

    public static int convertDecimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 2) + 10 * convertDecimalToBinary(n / 2);
    }
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(8));
        System.out.println(convertDecimalToBinary(10));
    }
}