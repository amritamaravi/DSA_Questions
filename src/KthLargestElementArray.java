import java.util.PriorityQueue;

public class KthLargestElementArray {
    public static void main(String[] args) {
    int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
    static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if(pq.size()<k){
                pq.add(nums[i]);
            }
            else if(pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
