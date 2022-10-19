import java.util.Stack;

public class Cau3 {
    public static boolean checkPalindrome(String text) {
        Stack<String> stk = new Stack<String>();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            stk.push(text.substring(i, i + 1));
        }

        while (!stk.isEmpty()) {
            result += stk.pop();
        }

        if (text.equals(result)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(checkPalindrome("abcba"));
    }
}