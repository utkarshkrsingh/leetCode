import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "aleetcode";
        System.out.println(findTheDifference(s, t));
    }
    static char findTheDifference(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        char result = '#';
        for (char ch : t.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.get(ch) - 1);
            if (freq.get(ch) == 0) freq.remove(ch);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 0) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}