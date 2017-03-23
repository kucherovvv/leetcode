public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // time: O(nlogn), mem: O(1)
        // но это каким-то образом быстрее?! WUUUT?!?!
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) 
            if (nums[i]==nums[i+1]) return true;
        return false;
        
        // time: O(n), mem: O(n)
        /*HashSet<Integer> hs = new HashSet<>();
        for (int num: nums) hs.add(num);
        return hs.size()!=nums.length;*/
    }
}