public class Cau3 {
    public static int productOfEvenDigits(int n) {
        if (n < 10) {
            if (n % 2 == 0) {
                return n;
            }
            return 1;
        }
        if ((n % 10) % 2 == 0) {
            return (n % 10) * productOfEvenDigits(n / 10);
        }
        return productOfEvenDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(productOfEvenDigits(0));
        System.out.println(productOfEvenDigits(102));
        System.out.println(productOfEvenDigits(123));
        System.out.println(productOfEvenDigits(246));
        System.out.println(productOfEvenDigits(256));
        System.out.println(productOfEvenDigits(357));
        System.out.println(productOfEvenDigits(4312));
        System.out.println(productOfEvenDigits(7856));
    }
}