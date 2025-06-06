import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
    static boolean wordPattern(String pattern, String s) {
        String[] strs = s.split("\\s+");
        if (pattern.length() != strs.length) return false;
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(strs[i])) {
                if (!map.get(strs[i]).equals(pattern.charAt(i))) return false;
            } else {
                if (map.containsValue(pattern.charAt(i))) return false;
                map.put(strs[i], pattern.charAt(i));
            }
        }
        return true;
    }
}