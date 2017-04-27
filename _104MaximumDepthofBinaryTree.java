package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/28 16:17
 */
public class _104MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left!=null||root.right!=null){
            return 1+maxDepth(root.left)>=maxDepth(root.right)?maxDepth(root.left):maxDepth(root.right);
        }
        return 1;
    }
}
