public class Main {
    public static void main(String[] args) {
        String phrase = "race, a c!ar";
        System.out.println(isPalindrome(phrase));
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
