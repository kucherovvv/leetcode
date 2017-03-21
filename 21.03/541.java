public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        // двойной поинтер, а не жопа какая-то
        for (int i = 0; i < s.length(); i+=2*k) {
            int l = i, r = Math.min(i+k-1,s.length()-1);
            for (; l < r; l++, r--) {
                char t = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, t);
            }
        }
        
        return sb.toString();
    }
}