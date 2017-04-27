package leetcode;


/**
 * @Author Eric Zhang
 * @Date 2017/3/31 15:26
 */
public class _110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if (Math.abs(left-right)>1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
