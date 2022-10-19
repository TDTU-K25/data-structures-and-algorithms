import java.util.Stack;

public class Cau3 {
    public static String dec2oct(int num) {
        if (num == 0) {
            return "0";
        } else {
            Stack<String> stk = new Stack<String>();
            String result = "";

            while (num != 0) {
                stk.push(Integer.toString(num % 8));
                num /= 8;
            }

            while (!stk.isEmpty()) {
                result += stk.pop();
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(dec2oct(100));
        System.out.println(dec2oct(0));
    }
}
