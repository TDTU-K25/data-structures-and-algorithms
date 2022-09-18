public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<Fraction> q = new MyQueue<Fraction>();

        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println();

        q.enQueue(new Fraction(5, 3));
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println();

        q.enQueue(new Fraction(9, 4));
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println();

        q.enQueue(new Fraction(1, 2));
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println(q.contains(new Fraction(5, 3)));
        System.out.println(q.contains(new Fraction(3, 5)));
        System.out.println();

        System.out.println(q.deQueue());
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println(q.deQueue());
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Front of queue is " + q.getFront());
    }
}