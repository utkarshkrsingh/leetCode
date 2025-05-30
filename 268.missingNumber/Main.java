import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!seen.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}