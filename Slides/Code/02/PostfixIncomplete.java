import java.util.*;

public class PostfixIncomplete {

	public static void main (String[] args) throws NoSuchElementException {
		String postfixExp = "";
		boolean end;
		StackLL <String> stack = new StackLL <String> ();
		//StackLLE <String> stack = new StackLLE <String> ();
		//StackArr  <String> stack = new StackArr <String> ();

		Scanner scanner = new Scanner("a-b");
		//Scanner scanner = new Scanner("a-b/c");
		//Scanner scanner = new Scanner("a+b+d/c");
		//Scanner scanner = new Scanner("a/b+d/c");
		//Scanner scanner = new Scanner("a+(b+d)/c");
		//Scanner scanner = new Scanner("a-(b+c*d)/e");

		String inputStr = scanner.next();
		try {
			for (int i=0; i < inputStr.length(); i++) {
				char ch = inputStr.charAt(i);
				System.out.println( "processing : " + ch);
				switch (ch) {
					case '*':
					case '/':
						//System.out.println( "inside * / " );
						// write your while loop here....


						//System.out.println( "out of while * /  " );
						break;

					case '+':
					case '-':
						//System.out.println( "inside + - " );
						// write your while loop here....


						//System.out.println( "out of while + - " );
						break;

					case '(': 
						//System.out.println( "inside ( " );
						// write your code here


						break;

					case ')':
						//System.out.println( "inside ) " );
						// write your code here

						stack.pop();
						break;

					default:  // operand
						//System.out.println( "operand " );
						// write your code here


						break;
				}
			} // for loop

			// write another while loop here to clear the stack
			// while (!stack.isEmpty())


		} catch (NoSuchElementException e) {
			//System.out.println("output of postfix so far: " + postfixExp);
			throw new NoSuchElementException (" bad input ");
		}

		System.out.println("output of postfix: " + postfixExp);
	}
}

