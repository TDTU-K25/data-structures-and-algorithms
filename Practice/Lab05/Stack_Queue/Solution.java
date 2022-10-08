import java.util.Stack;

public class Solution {

    public static int calculatePostfix(String s) {
        Stack<String> stk = new Stack<String>();

        String[] split_ch = s.split(" ");

        for (String ch : split_ch) {
            int a, b;
            switch (ch) {

                case "+":
                    a = Integer.valueOf(stk.pop());
                    b = Integer.valueOf(stk.pop());
                    stk.push(Integer.toString(b + a));
                    break;

                case "-":
                    a = Integer.valueOf(stk.pop());
                    b = Integer.valueOf(stk.pop());
                    stk.push(Integer.toString(b - a));
                    break;

                case "*":
                    a = Integer.valueOf(stk.pop());
                    b = Integer.valueOf(stk.pop());
                    stk.push(Integer.toString(b * a));
                    break;

                case "/":
                    a = Integer.valueOf(stk.pop());
                    b = Integer.valueOf(stk.pop());
                    stk.push(Integer.toString(b / a));
                    break;

                default:
                    stk.push(ch);
                    break;
            }
        }
        return Integer.valueOf(stk.peek());
    }

    public static boolean isPalindrome(int n) {
        String digits = Integer.toString(n);
        Stack<Character> stk = new Stack<Character>();
        MyQueue<Character> q = new MyQueue<Character>();

        for (int i = 0; i < digits.length(); i++) {
            stk.push(digits.charAt(i));
            q.enQueue(digits.charAt(i));
        }

        while (!stk.isEmpty()) {
            if (stk.pop() != q.deQueue()) {
                return false;
            }
        }
        return true;
    }

    public static String reverseSentence(String str) {
        Stack<String> stk = new Stack<String>();
        String[] words = str.split(" ");
        for (String word : words) {
            stk.push(word);
        }
        String result = "";
        while (!stk.isEmpty()) {
            result += stk.pop() + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(calculatePostfix("9 2 - 6 * 7 + 7 / "));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(256652));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(reverseSentence("I like apple"));
    }
}