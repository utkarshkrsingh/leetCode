public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        for (int num : nums) {
            System.out.println(num);
        }
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[count] == 0) {
                if (count != i && nums[i] != 0) {
                    nums[count] = nums[i];
                    nums[i] = 0;
                } else {
                    continue;
                }
            }
            count++;
        }
    }
}