import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumCloset {
    public static int threeSumClosest(int[] nums, int target) {
        int i = 0;
        int min= Integer.MAX_VALUE;
        int out =0;
        Arrays.sort(nums);
        while(i< nums.length-2){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] +nums[j]+ nums[k];
                int flag = 0;
                // update min
                if(Math.abs(target-sum) < min){
                    out = sum;
                    min = Math.abs(target-sum);
                    flag =1;
                }
                // increment j til next number is same
                if(sum <= target ) while(nums[j] == nums[++j] && j<k);
                // increment j til next number is same
                if(sum >= target) while(nums[k] == nums[--k] && j<k);

            }
            // increment j til next number is same
            while(nums[i]  == nums[++i] && i< nums.length -2);
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
