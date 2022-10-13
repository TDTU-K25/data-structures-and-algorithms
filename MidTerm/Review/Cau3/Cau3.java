import java.util.Stack;

public class Cau3 {
    public static int calculate(String[] expression) {
        // code here
        Stack<Integer> stk = new Stack<Integer>();
        for (String ch : expression) {
            if (isNumber(ch)) {
                stk.push(Integer.valueOf(ch));
            } else {
                int o1 = stk.pop();
                int o2 = stk.pop();
                int o3 = 0;
                switch (ch) {
                    case "+":
                        o3 = o2 + o1;
                        stk.push(o3);
                        break;

                    case "-":
                        o3 = o2 - o1;
                        stk.push(o3);
                        break;
                }
            }
        }
        return stk.pop();
    }

    private static boolean isNumber(String str) {
        return str.matches("0|([1-9][0-9]*)");
    }

    public static void main(String args[]) {
        System.out.println(calculate(new String[] { "31", "12", "+" }));
        System.out.println(calculate(new String[] { "3", "4", "+", "2", "1", "+", "-" }));
    }
}