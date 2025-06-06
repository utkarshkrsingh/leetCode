import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "IceCream";
        System.out.println(reverseVowels(s));
    }

    static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        Set<Character> vowels = Set.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');

        while (left < right) {
            if (vowels.contains(str[left]) && vowels.contains(str[right])) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            } else if (!vowels.contains(str[left])) {
                left++;
            } else if (!vowels.contains(str[right])) {
                right--;
            }
        }

        return new String(str);
    }
}