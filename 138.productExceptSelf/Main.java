public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }

    static int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int[] prefixArr = new int[nums.length];
        prefixArr[0] = prefix;
        for (int i = 1; i < nums.length; i++) {
            prefix = prefix * nums[i-1];
            prefixArr[i] = prefix;
        }

        int suffix = 1;
        int[] suffixArr = new int[nums.length];
        suffixArr[nums.length-1] = suffix;
        for (int i = nums.length-2; i >= 0; i--) {
            suffix = suffix * nums[i+1];
            suffixArr[i] = suffix;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixArr[i] * suffixArr[i];
        }
        return result;
    }
}