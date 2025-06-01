public class Main {
    public static void main(String[] args) {
        String s = "b";
        String t = "c";
        System.out.println(isSequence(s, t));
    }

    static boolean isSequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pos)) {
                pos++;
                if (pos == s.length()) {
                    return true;
                }
            }
        }
        return pos == s.length();
    }
}