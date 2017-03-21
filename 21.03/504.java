public class Solution {
    
    // ноль проебал
    public String convertToBase7(int num) {
        if (num==0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean negative = num < 0;
        if (negative) num*=-1;
        while (num!=0) {
            int p = num%7;
            num/=7;
            sb.append(String.valueOf(p));
        }
        if (negative) sb.append('-');
        sb.reverse();
        return sb.toString();
        //return Integer.toString(num,7);

    }
}