import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);
        int i =0;
        while(i < nums.length-3){
            int j = i+1;
            while( j < nums.length-2){

                int k = j+1;
                int t = nums.length-1;
                while(k<t){
                    int sum = nums[i]+nums[j]+nums[k]+nums[t];
                    if(sum ==target){
                        out.add(Arrays.asList(nums[i],nums[j],nums[k],nums[t]));


                        while(k < t && nums[k] == nums[++k]  );
                        while(k < t && nums[t] == nums[--t]  );

                    }
                    else if(sum > target){
                        while(k < t && nums[t] == nums[--t]  );
                    }
                    else  while(k < t && nums[k] == nums[++k] );
                }
                while(j < nums.length-2 && nums[j] == nums[++j]  );
            }
            while(nums[i]==nums[++i] && i < nums.length-3);
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2} , 0));
    }
}
