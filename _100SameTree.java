package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/27 21:29
 */
public class _100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null||q==null)
            return false;
        if (p.val==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;
    }
}
