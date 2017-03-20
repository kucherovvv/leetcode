public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j = 0;//greed; cookie
        
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) i++; 
            j++; // go for a bigger cookie
        }
        
        
        return i;
    }
}