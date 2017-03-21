public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int a = x;
        int b = 0;
        while (a!=0) {
            if (Integer.MAX_VALUE/10 < b) return false;
            if (Integer.MAX_VALUE/10 == b && Integer.MAX_VALUE%10 < a%10) return false;
            b*=10;
            b += a%10;
            
            a/=10;
        }
        
        return b==x;

    }
}