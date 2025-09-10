import java.util.ArrayList;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums, 2));
    }
    static List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;
        for(int ele: nums){
            if(ele==target){
                tcount++;
            } else if(ele<target){
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
}
