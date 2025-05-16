public class Main {
    public static void main(String[] args) {
        int[] nums1 = { 1 };
        int[] num2 = {};
        int m = 1, n = 0;
        merge(nums1, m, num2, n);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = nums1.clone();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k] = temp[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums1[k] = temp[i];
            i++;
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }
}