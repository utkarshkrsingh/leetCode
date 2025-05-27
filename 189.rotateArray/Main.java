public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(nums, k);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        k = n - k;
        int cycles = gcd(n, k);
        for (int i = 0; i < cycles; i++) {
            int startEle = nums[i];
            int currentIdx = i, nextIdx;
            while (true) {
                nextIdx = (currentIdx + k) % n;
                if (nextIdx == i) break;
                nums[currentIdx] = nums[nextIdx];
                currentIdx = nextIdx;
            }
            nums[currentIdx] = startEle;
        }
    }

    static int gcd(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}