public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {String t = num1; num1 = num2; num2 = t;}
        int n = num1.length(), m = num2.length();
        StringBuilder sb = new StringBuilder(n+1);
        sb.setLength(n+1);
        int carry = 0;
        for (int i = n-1, j = m-1, k = n; k >= 0; i--,j--,k--) {
            int s = carry;
            s += (i >= 0 ? num1.charAt(i)-'0' : 0);
            s += (j >= 0 ? num2.charAt(j)-'0' : 0);
            carry = s/10;
            s %= 10;
            sb.setCharAt(k,(char)(s+'0'));
        }
        return (sb.charAt(0)=='0' ? sb.substring(1) : sb.toString());
    }
}