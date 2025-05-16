public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,1,2,2,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[count] == val) {
                if (nums[i] != val && count != i) {
                    nums[count] += nums[i];
                    nums[i] = nums[count] - nums[i];
                    nums[count] -= nums[i];
                } else {
                    continue;
                }
            }
            count++;
        }
        return count;
    }
}