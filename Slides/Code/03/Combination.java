import java.util.*;

public class Combination {

	public static void main(String[] args) {
		int m, n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m and n: ");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println(m + " choose " + n + " is " + choose(m, n));
	}

	public static int choose(int n, int k) {
		if (k>n) return 0;
		if (k==n || k==0) return 1;
		return choose(n-1, k-1) + choose(n-1, k);
	}
}
