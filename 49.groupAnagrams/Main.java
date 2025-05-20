import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> myMap = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int count : freq) {
                sb.append(count).append("#");
            }
            String key = sb.toString();
            myMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        result.addAll(myMap.values());
        return result;
    }
}