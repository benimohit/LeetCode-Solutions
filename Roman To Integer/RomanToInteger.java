public class RomanToInteger {
    public static int romanToInt(String s) {
        int out = 0;
        char p = ' ';
        for(int i =0; i<s.length(); i++){
            out += getValue(s.charAt(i),p);
            p = s.charAt(i);
        }
        return out;
    }
    public static int getValue(char c, char p){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return p == 'I' ? 3: 5;
            case 'X':
                return p == 'I' ? 8: 10;
            case 'L':
                return p == 'X' ? 30: 50;
            case 'C':
                return p == 'X' ? 80: 100;
            case 'D':
                return p == 'C' ? 300: 500;
            case 'M':
                return  p == 'C' ? 800: 1000;
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
