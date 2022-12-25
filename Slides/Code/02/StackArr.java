import java.util.*;

class StackArr <E> implements StackADT <E> {
	private E[] arr;
	private int top;
	private int maxSize;
	private final int INITSIZE = 1000;

	public StackArr() {
		arr = (E[]) new Object[INITSIZE]; // creating array of type E
		top = -1;  // empty stack - thus, top is not on an valid array element
		maxSize = INITSIZE;
	}

	public boolean empty() { 
		return (top < 0); 
	}

	public E peek() throws EmptyStackException {
		if (!empty()) return arr[top];
		else throw new EmptyStackException();
	}

	public E pop() throws EmptyStackException {
		E obj = peek();
		top--;
		return obj;
	}

	public void push(E obj) {
		if (top >= maxSize - 1) enlargeArr();
		top++;
		arr[top] = obj;
	}

	private void enlargeArr() {
		// When there is not enough space in the array
		// we use the following method to double the number 
		// of entries in the array to accommodate new entry
		int newSize = 2 * maxSize;
		E[] x = (E[]) new Object[newSize];

		for (int j=0; j < maxSize; j++) {
			x[j] = arr[j];
		}
		maxSize = newSize;
		arr = x;
	}
}
