public class MaxiSubarray {
    public static void main(String[] args) {
        int[] nums = {12, 3, -3, 4, 2 ,1};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums){
        int currsum = nums[0];
        int maxsum = nums[0];
        for (int i = 1; i <nums.length; i++) {
            if(currsum + nums[i] > nums[i]){
                currsum+=nums[i];
            }
            else{
                currsum = nums[i];
            }
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
}
