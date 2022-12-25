// This program records the running-time of a triply nested loop.
import java.util.*;

public class CompareRunningTimes3 {
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter problem size n: ");
		int n = sc.nextInt();

		// Triply nested loop
		long startTime = System.currentTimeMillis();
		int x = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<n; k++) {
					x++;
				}
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Triply nested loop: " + elapsedTime);
	}
}

