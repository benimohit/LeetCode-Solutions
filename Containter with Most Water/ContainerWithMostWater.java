public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0, r = height.length - 1;

        while(l<r){
            int cap = Math.min(height[l],height[r]) * (r-l);
            if(max < cap) max =cap;
            //Skip the small edge and try next/previous
            if(height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println( maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
s