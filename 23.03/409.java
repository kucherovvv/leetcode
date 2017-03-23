public class Solution {
    public int longestPalindrome(String s) {
        int[] a = new int[256];
        int res = 0;
        int buf = 0;
        for (int i = 0; i < s.length(); i++) a[s.charAt(i)]++;
        
        for (int i = 0; i < 256; i++) {
            if ((a[i] & 1) == 0) {
                res += a[i];
            } else {
                res += a[i]-1;
                buf=1;
            }
        }
        res+=buf;
        return res;
        
    }
}