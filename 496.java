public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        for (int i = 0; i < findNums.length; i++) {
            int num = findNums[i];
            int j = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[j] == num) break;
            }
            j++;
            for (; j < nums.length; j++) {
                if (nums[j] > num) break;
            }
            if (j == nums.length) findNums[i] = -1;
            else findNums[i] = nums[j];
        }
        return findNums;
        /*Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;*/
    }
}