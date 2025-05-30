import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int minPositive = 1;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
            }
        }
        while (true) {
            if (!seen.contains(minPositive)) {
                return minPositive;
            } else {
                minPositive++;
            }
        }
    }
}