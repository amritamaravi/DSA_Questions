public class SearchInsertPosition {
    public static void main(String[] args) {
int[] nums = {1, 3, 5, 7};
        System.out.println(searchInsert(nums, 2));
    }
    static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
