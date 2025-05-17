public class Main {
    public static void main(String[] args) {
        String s = "cat";
        String t = "car";
        System.out.println(isAngram(s, t));
    }

    static boolean isAngram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] checked = new int[26];
        for (int i = 0; i < s.length(); i++) {
            checked[s.charAt(i) - 'a']++;
            checked[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (checked[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
