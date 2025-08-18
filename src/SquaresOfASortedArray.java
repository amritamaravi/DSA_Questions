import java.util.*;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (sorted order):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method
        int[] result = sortedSquares(nums);

        // Output
        System.out.println("Squares of sorted array:");
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while(start <= end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];

            if(ss > es){
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}
