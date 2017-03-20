public class Solution {
    public int minMoves(int[] nums) {
        //Lots of hairy bullshit from a stupid brain
        /*Arrays.sort(nums);
        int sum = 0, lenToGap = 1;
        int i = nums.length-2; // preFinal cell
        while (i >= 0 && nums[i+1]==nums[i]) {i--; lenToGap++;}
        for (; i > 0;) {
            //if (nums[i+1]!=nums[i]) { //if gap
            sum +=nums[i+1]-nums[i];
            i--;lenToGap++;
            while (i >= 0 && nums[i+1]==nums[i]) {i--; lenToGap++;}
            sum+=lenToGap;
            //}

        }
        return sum;*/
        
        int min = nums[0];
        for (int num: nums) min = Math.min(min,num);
        int sum = 0;
        for (int num: nums) sum+= num-min;
        
        return sum;
    }
}