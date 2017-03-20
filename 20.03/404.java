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
    
    /*boolean goneLeft = false;
    int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return sum;
        if (root.left == null && root.right == null && goneLeft) {sum+=root.val; return sum;}
        
        goneLeft = true;
        sumOfLeftLeaves(root.left);
        
        goneLeft = false;
        sumOfLeftLeaves(root.right);
        
        return sum;
    }*/
    // глобальные переменные - плохо!
    
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int ans = 0;
        if (root.left!=null) {
            if (root.left.left==null && root.left.right==null) ans+=root.left.val;
            else ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);
        
        return ans;
    }
    
}