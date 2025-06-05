public class Main {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String[] array = s.split("\\s+");
        return array[array.length-1].length();
    }
}