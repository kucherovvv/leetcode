public class Solution {
    public int findComplement(int num) {
        int x = 1;
        while (x<num) {x<<=1; x|=1;}
        return (~num)&x;
    }
}