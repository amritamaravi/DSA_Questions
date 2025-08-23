public class MaxAscendingSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(nums));
    }
    static int maxAscendingSum(int[] nums){
        int max = nums[0];
        int currmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] < nums[i]){
                currmax= currmax + nums[i];
            }
            else{
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }
        max = Math.max(max, currmax);
        return max;
    }

}
