public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        /*for (int i = 0; i <= n/2; i++) {
            int c = 1;
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]) c++;
            }
            if (c > n/2) return nums[i];
        }
        return -1;*/
        int major = nums[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (nums[i]==major) {count++;}
            else count--;
        }
        return major;

        // всё изи, потмоу что count всегда будет положителен в конце, тк major всегда больше, чем остальных элементов
    }
}