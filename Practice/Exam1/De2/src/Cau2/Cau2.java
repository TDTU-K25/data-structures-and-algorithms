import java.util.Stack;

public class Cau2 {
    public static String reverseIntList(int[] arr) {
        Stack<Integer> stk = new Stack<Integer>();

        for (int i = 0; i < arr.length; i++) {
            stk.push(arr[i]);
        }

        String result = "";

        while (!stk.isEmpty()) {
            result += stk.pop();
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseIntList(new int[] { 1, 2, 3, 4, 5 }));
    }
}