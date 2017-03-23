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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return max;
    }
    
    int getHeight(TreeNode root) {
        if (root==null) return -1;
        int hl = getHeight(root.left)+1, hr = getHeight(root.right)+1;
        max = Math.max(hl+hr, max);
        return Math.max(hl,hr);
    }
}