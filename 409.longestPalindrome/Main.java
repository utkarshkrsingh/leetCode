import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    static int longestPalindrome(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        boolean hasOddFreq = false;
        int result = 0;
        for (int freq : hashMap.values()) {
            if (freq % 2 == 0) {
                result += freq;
            } else {
                result += freq - 1;
                hasOddFreq = true;
            }
        }

        if (hasOddFreq) {
            return result + 1;
        }
        return result;
    }
}