public class Main {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for (char ch : s) {
            System.out.println(ch);
        }
    }

    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}