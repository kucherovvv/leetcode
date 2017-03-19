public class Solution {
    public void moveZeroes(int[] nums) {
        // тут было снова сложное, неинтуитивное решение...
        int ind = 0;
        for (int num: nums) {
            if (num!=0) nums[ind++] = num;
        }
        for (;ind < nums.length; ind++) nums[ind] = 0;
    }
}