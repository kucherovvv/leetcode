public class Solution {
    public String reverseString(String s) {
        /*StringBuilder sb = new StringBuilder(s.length());
        
        for (int i = s.length()-1; i >=0; i--) {
            sb.append(s.charAt(i));
        }*/
        
        /*StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        
        for (int i = 0, j = n-1; i < j; i++, j--) {
            char c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, c);
        }
        
        return sb.toString();*/
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}