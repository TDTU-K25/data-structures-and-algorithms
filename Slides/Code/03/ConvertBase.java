import java.util.*;

public class ConvertBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value in base 10: ");
		int value = sc.nextInt();
		System.out.print("Enter base to convert to: ");
		int base = sc.nextInt();

		System.out.print(value + " in base 10 = ");
		displayInBase(value, base);
		System.out.println(" in base " + base);
	}

	public static void displayInBase(int n, int base) {
		if (n > 0) {
			displayInBase(n / base, base);
			System.out.print(n % base);
		}
	}
}
