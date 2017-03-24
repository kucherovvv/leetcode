public class Solution {
    
    public int climbStairs(int n) {
        /*int [] buf = new int[Math.max(n+1,2)];
        buf[0] = 1;
        buf[1] = 1;
        for (int i = 2; i <= n; i++) buf[i] = buf[i-2]+buf[i-1];
        return buf[n];*/
        if (n==0 || n==1) return 1;
        int pprev = 0, prev = 1,cur = 1;
        for (int i = 1; i <= n; i++) {
            cur = prev+pprev;
            pprev = prev;
            prev = cur;
        }
        return cur;
    }
}