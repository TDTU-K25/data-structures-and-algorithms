// This program records the running-time of a single loop.
import java.util.*;

public class CompareRunningTimes1 {
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter problem size n: ");
		int n = sc.nextInt();

		// Single loop
		long startTime = System.currentTimeMillis();
		int x = 0;
		for (int i=0; i<n; i++) {
			x++;
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Single loop: " + elapsedTime);

	}
}

