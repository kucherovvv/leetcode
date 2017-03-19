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
    public TreeNode invertTree(TreeNode root) {
        /*if (root==null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode t = root.right;
        root.right = root.left;
        root.left = t;
        return root;*/
        if (root==null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode rt = q.poll();
            TreeNode t = rt.right;
            rt.right = rt.left;
            rt.left = t;
            
            if (rt.right!=null) q.offer(rt.right);
            if (rt.left!=null) q.offer(rt.left);
        }
        return root;
    }
}