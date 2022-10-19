import java.util.Stack;

public class Question2 {
    public static boolean isPalindrome(int a) {
        String digits = Integer.toString(a);
        Stack<String> stk = new Stack<String>();
        for (int i = 0; i < digits.length(); i++) {
            stk.push(digits.substring(i, i + 1));
        }

        String result = "";
        while (!stk.isEmpty()) {
            result += stk.pop();
        }

        if (a == Integer.valueOf(result)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1232));
    }
}