import java.util.*;
public class Palindromes {

	public static void main (String[] args) throws NoSuchElementException {
		// you can use any of the following stack/queue implementations
		//StackLLE <String> stack = new StackLLE <String> ();
		Stack <String> stack = new Stack <String> ();
		//StackLL <String> stack = new StackLL <String> ();
		//StackArr <String> stack = new StackArr <String> ();
		//QueueLL <String> queue = new QueueLL <String> ();
		//QueueLLE <String> queue = new QueueLLE <String> ();
		//QueueArr <String> queue = new QueueArr <String> ();
		Queue <String> queue = new LinkedList <String> ();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String inputStr = scanner.next();
		for (int i=0; i < inputStr.length(); i++) {
			String ch = inputStr.substring(i, i+1);
			stack.push(ch);
			queue.offer(ch);
		}

		boolean ans = true;
		try {
			while (!stack.isEmpty() && ans) {
				if (!(stack.pop().equals(queue.poll())))
					ans = false;
			}
		} catch (NoSuchElementException  e) {
			throw new NoSuchElementException();
		}

		System.out.print(inputStr + " is ");
		if (ans) 
			System.out.println("a palindrome");
		else 
			System.out.println("NOT a palindrome");
	}
}
