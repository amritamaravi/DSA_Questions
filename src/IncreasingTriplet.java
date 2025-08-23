public class IncreasingTriplet  {
    public static void main(String[] args) {
    int[] nums = {8, 4, 3, 5, 7};
        System.out.println(increasingTriplet(nums));
    }
    static boolean increasingTriplet(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;


        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if(first >= ele){
                first = ele;
            }
            else if(second >= ele){
                second = ele;
            }
            else{
                third = ele;
                return true;
            }
        }
        return false;

    }
}
