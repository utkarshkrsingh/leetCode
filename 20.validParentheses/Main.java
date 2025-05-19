import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = 0;
        Map<Character, Character> seen = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (seen.containsKey(ch)) {
                if (top == 0 || stack[top - 1] != seen.get(ch)) {
                    return false;
                } else {
                    top--;
                }
            } else {
                stack[top++] = ch;
            }
        }

        return (top == 0);
    }
}