package leetcode;

import leetcode.TreeNode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/27 21:52
 */
public class _101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root==null||isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode left, TreeNode right){
        if (left==null&&right==null)
            return true;
        if (left==null||right==null)
            return false;
        if (left.val==right.val)
            return isSym(left.left,right.right)&&isSym(left.right,right.left);
        return false;
    }
}
