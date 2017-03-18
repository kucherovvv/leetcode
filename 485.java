public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                c++;
            } else {
                max = Math.max(max,c);
                c = 0;
            }
        }
        max = Math.max(max,c);
        return max;

        /*
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 

        */
    }
}