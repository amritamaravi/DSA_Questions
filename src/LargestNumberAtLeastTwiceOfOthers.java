import java.util.*;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method
        int index = dominantIndex(nums);

        // Output
        System.out.println("Result index: " + index);
    }

    public static int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxIdx = i;
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }

        if (smax * 2 <= max) {
            return maxIdx;
        } else {
            return -1;
        }
    }
}