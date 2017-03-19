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
    // снова жопой думал
    /*class Buf {
        int mostL; int mostR; int localMin;
    }*/
    
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        /*Buf b = getMD(root);
        return b.localMin;*/
        
        if (root==null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev!=null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;

    }
    /*
    Buf getMD(TreeNode root) {
        Buf buf = new Buf();
        int LRdiff, RLdiff, Lmin, Rmin;
        LRdiff = RLdiff = Lmin = Rmin = Integer.MAX_VALUE;
        
        
        if (root.left == null && root.right == null) {
            buf.mostR = buf.mostL = root.val;
            buf.localMin = Integer.MAX_VALUE;
            return buf;
        }
        
        if (root.left != null) {
            Buf b = getMD(root.left);
            buf.mostL = b.mostL;
            LRdiff = root.val-b.mostR;
            Lmin = b.localMin;
        } else {
            buf.mostL = root.val;
        }
        
        if (root.right != null) {
            Buf b = getMD(root.right);
            buf.mostR = b.mostR;
            RLdiff = b.mostL-root.val;
            Rmin = b.localMin;
        } else {
            buf.mostR = root.val;
        }
        
        buf.localMin = Math.min(LRdiff, Math.min(RLdiff, Math.min(Lmin, Rmin)));
        return buf;
    }*/
}