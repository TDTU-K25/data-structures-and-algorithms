import java.util.*;
public class TestStack {
	public static void main (String[] args) {

		// You can use any of the following 4 implementations of Stack
		StackArr <String> stack = new StackArr <String>();  // Array 
		//StackLL <String> stack = new StackLL <String>(); // LinkedList composition 
		//StackLLE <String> stack = new StackLLE <String>(); // LinkedList inheritance 
		//Stack <String> stack = new Stack <String>();  // Java API

		System.out.println("stack is empty? " + stack.empty());
		stack.push("1");
		stack.push("2");
		System.out.println("top of stack is " + stack.peek());
		stack.push("3");
		System.out.println("top of stack is " + stack.pop());
		stack.push("4");
		stack.pop();
		stack.pop();
		System.out.println("top of stack is " + stack.peek());
	}
}
