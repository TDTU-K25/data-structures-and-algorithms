import java.util.*;
public class TestQueue {
	public static void main (String[] args) {

		// you can use any one of the following implementation
		//QueueArr <String> queue= new QueueArr <String> (); // Array
		QueueLL <String> queue= new QueueLL <String> (); // LinkedList composition
		//QueueLLE <String> queue= new QueueLLE <String> (); // LinkedList inheritance

		System.out.println("queue is empty? " + queue.isEmpty());
		queue.offer("1");
		System.out.println("operation: queue.offer(\"1\")");
		System.out.println("queue is empty? " + queue.isEmpty());
		System.out.println("front now is: " + queue.peek());
		queue.offer("2");
		System.out.println("operation: queue.offer(\"2\")");
		System.out.println("front now is: " + queue.peek());
		queue.offer("3");
		System.out.println("operation: queue.offer(\"3\")");
		System.out.println("front now is: " + queue.peek());
		queue.poll();
		System.out.println("operation: queue.poll()");
		System.out.println("front now is: " + queue.peek());
		System.out.print("checking whether queue.peek().equals(\"1\"): ");
		System.out.println(queue.peek().equals("1"));
		queue.poll();
		System.out.println("operation: queue.poll()");
		System.out.println("front now is: " + queue.peek());
		queue.poll();
		System.out.println("operation: queue.poll()");
		System.out.println("front now is: " + queue.peek());
	}
}
