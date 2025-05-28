public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        System.out.println(zeroFilledSubarray(nums));        
    }

    static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long consecutiveZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                consecutiveZero++;
            } else {
                count += consecutiveZero * (consecutiveZero + 1) / 2;
                consecutiveZero = 0;
            }
        }
        count += consecutiveZero * (consecutiveZero + 1) / 2;
        return count;
    }
}