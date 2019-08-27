
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] pair = new int[2];
        for(int i = 0; i < nums.length; i++){
            int comp=target-nums[i];
            if(map.containsKey(comp) && map.get(comp)!=i){
                pair = new int[] {map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return pair;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
