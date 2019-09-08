public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        int len = s.length();
        // edge condition
        if(numRows == 1 || s.equals("") || len <= numRows) return s;

        StringBuilder output = new StringBuilder();
        int stepSize = (numRows*2)-2;
        //First Row
        for(int i = 0; i < len; i=i + stepSize ){
            output.append(s.charAt(i));
        }
        // Middle Rows
        for(int i = 1; i < numRows-1; i++){
            int tempStep = stepSize;
            output.append(s.charAt(i));
            while(tempStep - i  < len){
                if(tempStep-i > 0 ){
                    output.append(s.charAt(tempStep-i));
                }
                if(tempStep+i < len){
                    output.append(s.charAt(tempStep+i));

                }
                tempStep += stepSize;
            }
        }
        //Last Row
        for(int i = numRows-1; i < len; i=i + stepSize ){
            output.append(s.charAt(i));
        }
        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING",3));
    }
}
