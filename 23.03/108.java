/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return generateTree(nums,0,nums.length-1);
    }
    public TreeNode generateTree(int[] nums, int l, int r) {
        if (l>r) return null;
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = generateTree(nums, l, m-1);
        root.right = generateTree(nums, m+1, r);
        return root;
    }
}