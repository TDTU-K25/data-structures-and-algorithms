public class CountDown {

	public static void countDown(int n) {
		if (n <= 0)
			System.out.println("BLAST OFF!!!");
		else {
			System.out.println("Count down at time " + n);
			countDown(n-1);
		}
	}

	public static void main(String[] args) {
		countDown(10);
	}
}
