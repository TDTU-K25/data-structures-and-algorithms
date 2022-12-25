import java.util.*;

class QueueLLE <E> extends TailedLinkedList <E> implements QueueADT <E> {

	public boolean offer(E o) { 
		addLast(o); 
		return true;
	}

	public E peek() {
		if (isEmpty()) return null;
		return getFirst();
	}

	public E poll() {
		E obj = peek();
		if (!isEmpty()) removeFirst();
		return obj;
	}
}
