import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int k = 9;
        int[] result = twoSum(nums, k);
        for (int item : result) {
            System.out.println(item);
        }
    }

    static int[] twoSum(int[] nums, int k) {
        int[] result = new int[2];
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(k - nums[i])) {
                result[0] = seen.get(k - nums[i]);
                result[1] = i;
                break;
            }
            seen.put(nums[i], i);
        }
        return result;
    }
}