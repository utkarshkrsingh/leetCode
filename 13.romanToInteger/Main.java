import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        int pos = 0;
        while (pos < s.length()) {
            if (pos < s.length()-1 && romans.get(s.charAt(pos)) < romans.get(s.charAt(pos+1))) {
                result += romans.get(s.charAt(pos+1)) - romans.get(s.charAt(pos));
                pos += 2;
            } else {
                result += romans.get(s.charAt(pos));
                pos++;
            }
        }
        return result;
    }
}