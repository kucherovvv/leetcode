public class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char nextC = (i != n-1 ? s.charAt(i+1) : '-');
            if (c=='I') {
                if (nextC=='V') {res+=4; i++;}
                else if (nextC=='X') {res+=9; i++;}
                else res+=1;
            } else if (c=='V') {
                res+=5;
            } else if (c=='X') {
                if (nextC=='L') {res+=40; i++;}
                else if (nextC=='C') {res+=90; i++;}
                else res+=10;
            } else if (c=='L') {
                res+=50;
            } else if (c=='C') {
                if (nextC=='D') {res+=400; i++;}
                else if (nextC=='M') {res+=900; i++;}
                else res+=100;
            } else if (c=='D') {
                res+=500;
            } else if (c=='M') {
                res+=1000;
            } 
            
        }
        return res;

    }
}