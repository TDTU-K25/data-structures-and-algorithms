import java.util.Stack;

public class Cau2 {
    public static String reverseSentence(String str) {
        Stack<String> stk = new Stack<String>();

        String[] words = str.split(" ");

        for (String word : words) {
            stk.push(word);
        }

        String result = stk.pop();

        while (!stk.isEmpty()) {
            result += " " + stk.pop();
        }

        // String result = "";

        // while (!stk.isEmpty()) {
        //     result += stk.pop() + " ";
        // }

        // return result.trim();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseSentence("I am a student"));
    }
}