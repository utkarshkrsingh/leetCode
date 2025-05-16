public class Main {
    public static void main(String[] args) {
        int[] digits = {1,1,1,9};
        int[] result = plusOne(digits);
        for (int digit : result) {
            System.out.println(digit);
        }
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}