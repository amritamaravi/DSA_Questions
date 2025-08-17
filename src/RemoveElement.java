public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        // removeElement(nums, val);
        System.out.println(removeElement(nums, val));
    }

    static int removeElement(int[] nums, int val) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}
