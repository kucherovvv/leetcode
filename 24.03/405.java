public class Solution {
    public String toHex(int num) {
        if (num==0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        for (int offset = 7; offset >= 0; offset--) {
            int symb = (num & (0xF << (offset*4))) >>> (offset*4);
            if (symb!=0) b = true;
            if (b) sb.append( (char)(symb < 10 ? (symb+'0') : (symb-10+'a')) );
        }
        return sb.toString();
    }
}