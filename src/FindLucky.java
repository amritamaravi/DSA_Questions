import java.util.HashMap;

public class FindLucky {
    public static void main(String[] args) {
int[] arr = {1, 1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }

    static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int ele = arr[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        int ans = -1;
        for(int key : hm.keySet()){
            if(hm.get(key)==key){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
}
