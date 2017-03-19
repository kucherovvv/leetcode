public class Solution {
    public int getSum(int a, int b) {
        /*int c = 0;
        int carry = 0;
        int abit, bbit, mask;
        for (int i = 0; i < 32; i++) {
            mask = 1<<i;
            abit = a & 1; a>>=1;
            bbit = b & 1; b>>=1;
            c |= (carry ^ abit ^ bbit) << i;
            carry = (abit&bbit) | (abit&carry) | (bbit&carry);
            
            
        }
        return c;*/
        int carry = 0;
        while (b!=0) {
            carry = a&b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
}