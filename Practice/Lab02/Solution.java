public class Solution {

    // Exercise 2
    public static int pow(int x, int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        return res;
    }

    public static int computeExpression(int n) {
        MyStack<Integer> stk = new MyStack<Integer>();
        for (int i = n; i >= 1; i--) {
            stk.push(pow(2, i) + pow(i, 2));
        }
        int sum = 0;
        while (!stk.isEmpty()) {
            sum += stk.pop();
        }
        return sum;
    }

    // Exercise 3
    public static void printReverseOrder(String str) {
        char[] arr = str.toCharArray();
        MyStack<Character> stk = new MyStack<Character>();
        for (char ch : arr) {
            stk.push(ch);
        }
        System.out.print("Sequence of characters: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }

        System.out.println();

        System.out.print("Sequence of characters in reverse order: " + stk.pop());
        while (!stk.isEmpty()) {
            System.out.print(", " + stk.pop());
        }

        System.out.println();
    }

    // Exercise 4
    public static boolean isBracketMatching(String str) {
        MyStack<Character> stk = new MyStack<Character>();
        char[] delimiters = str.toCharArray();

        for (Character delimiter : delimiters) {
            // left delimiters (opening brackets)
            if (delimiter.equals('(') || delimiter.equals('[') || delimiter.equals('{')) {
                stk.push(delimiter);
            } else { // right delimiters (closing brackets)
                if (delimiter.equals(')') || delimiter.equals(']') || delimiter.equals('}')) {
                    if (stk.isEmpty()) { // Case: too many closing brackets
                        return false;
                    } else {
                        String bracket = Character.toString(stk.pop()) + Character.toString(delimiter);
                        if (!bracket.equals("()") && !bracket.equals("[]") && !bracket.equals("{}")) {
                            return false;
                        }
                    }
                }
            }
        }
        if (!stk.isEmpty()) { // Case: too many opening brackets
            return false;
        }
        return true;
    }

    // Exercise 5
    public static boolean isQueueEquivalentTwoStack(String str) {
        MyStack<Character> stk1 = new MyStack<Character>();
        MyStack<Character> stk2 = new MyStack<Character>();
        MyQueue<Character> q = new MyQueue<Character>();
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            stk1.push(ch);
            q.enQueue(ch);
        }

        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }

        String strFromQueue = new String();
        while (!q.isEmpty()) {
            strFromQueue += (Character.toString(q.deQueue()));
        }

        String strFromStack = new String();
        while (!stk2.isEmpty()) {
            strFromStack += (Character.toString(stk2.pop()));
        }

        return (strFromQueue.equals(strFromStack));
    }

    // Exercise 6
    public static boolean isPalindrome(String str) {
        MyStack<Character> stk = new MyStack<Character>();
        MyQueue<Character> q = new MyQueue<Character>();
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            stk.push(ch);
            q.enQueue(ch);
        }

        while (!stk.isEmpty() && !q.isEmpty()) {
            if (stk.pop() != q.deQueue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Exercise 2
        System.out.println("Exercise 2");
        System.out.println(computeExpression(5));
        System.out.println();

        // Exercise 3
        System.out.println("Exercise 3");
        printReverseOrder("abc");
        System.out.println();

        // Exercise 4
        System.out.println("Exercise 4");
        System.out.println(isBracketMatching("[()]"));
        System.out.println(isBracketMatching("{[()]}"));
        System.out.println(isBracketMatching("(()")); // too many opening brackets
        System.out.println(isBracketMatching("())")); // too many closing brackets
        System.out.println(isBracketMatching("[(])")); // mismatched brackets
        System.out.println();

        // Exercise 6
        System.out.println("Exercise 6");
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("deed"));
        System.out.println(isPalindrome("aibohphobia"));
        System.out.println(isPalindrome("data"));
        System.out.println(isPalindrome("little"));
    }
}