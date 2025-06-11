public class Main {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
    static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int add = a.charAt(i) + b.charAt(j) - 2 * '0' + carry;
            if (add == 2) {
                result.append(0);
                carry = 1;
            } else if (add == 3) {
                result.append(1);
                carry = 1;
            } else if (add <= 1) {
                result.append(add);
                carry = 0;
            }
            i--;
            j--;
        }

        while (i >= 0) {
            int add = a.charAt(i) - '0' + carry;
            if (add == 2) {
                result.append(0);
                carry = 1;
            } else if (add == 3) {
                result.append(1);
                carry = 1;
            } else if (add <= 1) {
                result.append(add);
                carry = 0;
            }
            i--;
        }

        while (j >= 0) {
            int add = b.charAt(j) - '0' + carry;
            if (add == 2) {
                result.append(0);
                carry = 1;
            } else if (add == 3) {
                result.append(1);
                carry = 1;
            } else if (add <= 1) {
                result.append(add);
                carry = 0;
            }
            j--;
        }

        if (carry > 0) result.append(carry);
        return result.reverse().toString();
    }
}