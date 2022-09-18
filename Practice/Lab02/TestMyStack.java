public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Fraction> stk = new MyStack<Fraction>();

        System.out.println("Is stack empty? " + stk.isEmpty());
        System.out.println();

        stk.push(new Fraction(5, 3));
        stk.print();
        System.out.println("Size: " + stk.size());
        System.out.println();

        System.out.println("Is stack empty? " + stk.isEmpty());
        System.out.println();

        stk.push(new Fraction(9, 4));
        stk.print();
        System.out.println("Size: " + stk.size());
        System.out.println();

        stk.push(new Fraction(1, 2));
        stk.print();
        System.out.println("Size: " + stk.size());
        System.out.println();

        System.out.println(stk.contains(new Fraction(5, 3)));
        System.out.println(stk.contains(new Fraction(3, 5)));
        System.out.println();

        System.out.println(stk.pop());
        stk.print();
        System.out.println("Size: " + stk.size());
        System.out.println();

        System.out.println(stk.pop());
        stk.print();
        System.out.println("Size: " + stk.size());
        System.out.println();
        
        System.out.println("Peek of stack is " + stk.getPeek());
    }
}