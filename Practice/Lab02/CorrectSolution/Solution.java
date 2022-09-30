public class Solution {
    // Exercise 2
    public static int ex2(int n) {

        MyStack<Integer> stk = new MyStack<Integer>();
        while (n > 1) {
            stk.push(Math.pow(2, n) + Math.pow(n, 2));
            n--;
        }
        stk.push(3);

        int result = 0;
        while (!stk.isEmpty()) {
            result += stk.pop();
        }
        return result;
    }
}
