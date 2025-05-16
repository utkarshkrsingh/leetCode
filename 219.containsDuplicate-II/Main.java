import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[args.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int k = Integer.parseInt(args[args.length-1]);
        System.out.println(isDuplicate(nums, k));
    }

    static boolean isDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(nums[i])) {
                if (Math.abs(seen.get(nums[i]) - i) == k) {
                    return true;
                }
            }
            seen.put(nums[i], i);
        }
        return false;
    }
}