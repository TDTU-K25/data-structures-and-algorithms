public class Question3 {
    public static int sumEvenDigits(int a) {
        if (a == 0) {
            return 0;
        }
        if ((a % 10) % 2 == 0)
            return (a % 10) + sumEvenDigits(a / 10);
        return sumEvenDigits(a / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumEvenDigits(123456));
    }
}