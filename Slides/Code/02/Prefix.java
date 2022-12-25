import java.util.*;

// http://www.c4swimmers.esmartguy.com/in2pre.htm - algorithm (roughly)

public class Prefix {

	public static void main (String [] args) throws NoSuchElementException  {
		StringBuffer r_prefixExp = new StringBuffer(); 
		boolean end;
		StackLL <Character> stack = new StackLL <Character> ();
		//StackLLE <Character> stack = new StackLLE <Character> ();
		//StackArr <Character> stack = new StackArr <Character> ();
		//Stack <Character> stack = new Stack <Character> ();

		//Scanner scanner = new Scanner("a-b");
		//Scanner scanner = new Scanner("a-b+c");
		//Scanner scanner = new Scanner("a+b+d/c");
		//Scanner scanner = new Scanner("a/b+d/c");
		//Scanner scanner = new Scanner("(b+d)");
		//Scanner scanner = new Scanner("(a/b)+(d/c)");
		//Scanner scanner = new Scanner("a+(b+d)/c");
		//Scanner scanner = new Scanner("c*(d/e)");
		//Scanner scanner = new Scanner("a-(b+c*d)/e");
		Scanner scanner = new Scanner("a-f+(b+c*d)/e");

		String inputStr = scanner.next();
		StringBuffer inputStr_b = new StringBuffer(inputStr);
		StringBuffer r_inputStr = inputStr_b.reverse();

		try {
			for (int i=0; i < inputStr.length(); i++) {

				//stack.print();

				char ch = r_inputStr.charAt(i);
				//System.out.println("processing : " + ch);
				switch (ch) {
					case '*':
					case '/':
						//System.out.println("inside * / ");
						stack.push(ch);
						break;
					case '+':
					case '-':
						//System.out.println("stack is empty? " + stack.isEmpty());
						//System.out.println("inside + - ");
						end = false;
						while (!stack.empty() && !end) { 
							if (!stack.peek().equals(')') && 
									!stack.peek().equals('+') && 
									!stack.peek().equals('-')) {
								r_prefixExp.append(stack.pop());
							} else
								end = true;
						}
						//stack.print();
						//System.out.println("out of while + - ");
						stack.push(ch);
						break;
					case ')': 
						//System.out.println("inside ) ");
						stack.push(ch);
						//stack.print();
						break;
					case '(':
						//System.out.println("inside ( ");
						//stack.print();
						while (!stack.peek().equals(')')) 
							r_prefixExp.append(stack.pop());
						stack.pop();
						break;
					default:  // operand
						//System.out.println("operand ");
						r_prefixExp.append(ch);
						break;
				}
			} // for loop
			while (!stack.empty())
				r_prefixExp.append(stack.pop());

		} catch (NoSuchElementException  e) {
			//System.out.println("output of so far prefix: " + prefixExp);
			throw new NoSuchElementException (" bad input ");
		}

		System.out.println("The prefix of " + inputStr + " is: " + r_prefixExp.reverse());
	}

}
