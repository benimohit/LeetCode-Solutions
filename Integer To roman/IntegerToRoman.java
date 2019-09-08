public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] nums ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romn = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder out = new StringBuilder();
        while(num != 0){
            for(int i =0 ; i<nums.length; i++){
                if(num >= nums[i]){
                    num = num - nums[i];
                    out.append(romn[i]);
                    break;
                }
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println( intToRoman(58));
    }

}
