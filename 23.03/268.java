public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0, totalSum = (0+n)*(n+1)/2;
        for (int t: nums) sum+=t;
        return (int)(totalSum-sum);
    }
}