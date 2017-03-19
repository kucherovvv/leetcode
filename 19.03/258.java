public class Solution {
    public int addDigits(int num) {
        num = 
        (num%10)+(num%100/10)+(num%1000/100)
        +(num%10000/1000)+(num%100000/10000)+(num%1000000/100000)
        +(num%10000000/1000000)+(num%100000000/10000000)+(num%1000000000/100000000)
        +((num/10)%1000000000/100000000);
        num = 
        (num%10)+(num%100/10)+(num%1000/100);
        num = 
        (num%10)+(num%100/10)+(num%1000/100);
        return num;
    }
}