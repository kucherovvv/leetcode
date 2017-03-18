public class Solution {
    public int hammingDistance(int x, int y) {
        /*int c = 0;
        for (int i = 1; i <= 32; i++) {
            if ((x&1)!=(y&1)) c++;
            x>>=1;
            y>>=1;
        }
        return c;*/
        //изи xor
        return Integer.bitCount(x^y);
    }
}
