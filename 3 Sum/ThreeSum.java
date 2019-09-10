import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l_o = new ArrayList<>();
        if (nums.length < 3) return l_o;

        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 2) {
            if (nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // Add in arraylist if some is 0
                if (sum == 0) l_o.add(Arrays.asList(nums[i], nums[j], nums[k]));
                // Increment j until next number is same
                if (sum <= 0) while (nums[j] == nums[++j] && j < k) ;
                // Increment k until next number is same
                if (sum >= 0) while (nums[k] == nums[--k] && j < k) ;

            }
            //Increment i until next number is same
            while (nums[i] == nums[++i] && i < nums.length - 2) ;
        }

        return l_o;
    }

    public static void main(String[] args) {
        System.out.println( threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
