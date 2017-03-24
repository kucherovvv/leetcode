public class Solution {
    public boolean isHappy(int num) {
        if (num <= 0) return false;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(num);
        while (true) {
            if (num == 1) break;
            
            int sum = 0;
            while (num!=0) {
                int digit = num%10;
                sum+=digit*digit;
                num/=10;
            }
            num = sum;
            if (!hs.add(num)) return false;
            
        } 
        return true;
    }
}