package leetcode;


import javax.xml.soap.Node;

/**
 * @Author Eric Zhang
 * @Date 2017/3/31 16:21
 */
public class _111MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode Node_4=new TreeNode(2);
        TreeNode Node_5=new TreeNode(4);
        TreeNode Node_6=new TreeNode(0);

        TreeNode Node_0=new TreeNode(2);
        TreeNode Node_1=new TreeNode(4);
        TreeNode Node_2=new TreeNode(0);
        TreeNode Node_3=new TreeNode(-3);

        TreeNode Node_root=new TreeNode(2);
        //TreeNode Node_4=new TreeNode(4);
        Node_0.left=Node_1;
        Node_0.right=Node_2;
        Node_1.left=Node_3;
        //Node_1.right=Node_4;
        Node_4.right=Node_5;
        Node_5.left=Node_6;

        Node_root.left=Node_4;
        Node_root.right=Node_0;
        _111MinimumDepthofBinaryTree obj=new _111MinimumDepthofBinaryTree();
        System.out.println(obj.minDepth(Node_root));
    }
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if (left==0)
            return right+1;
        else if (right==0)
            return left+1;
        return Math.min(left,right)+1;
    }
    public int getDepth(TreeNode root){
        if (root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if (left==0)
            return right+1;
        else if (right==0)
            return left+1;
        return 1+Math.min(left,right);
    }
}
