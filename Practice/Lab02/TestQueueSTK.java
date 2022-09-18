public class TestQueueSTK {
    public static void main(String[] args) {
        QueueSTK<Character> q = new QueueSTK<Character>();

        System.out.println("Is queue empty? " + q.isEmpty());

        q.offerItems(new Character[] { 'a', 'b', 'c' });
        q.print();

        System.out.println("Front of queue: " + q.getFront());

        System.out.println("Is queue empty? " + q.isEmpty());

        System.out.println(q.contains('a'));
        System.out.println(q.contains('d'));

        System.out.print("Dequeue");
        System.out.print(q.deQueue());
        q.print();

        System.out.print("Dequeue");
        System.out.print(q.deQueue());
        q.print();

        // System.out.print("Dequeue");
        // System.out.print(q.deQueue());
        // q.print();
    }
}