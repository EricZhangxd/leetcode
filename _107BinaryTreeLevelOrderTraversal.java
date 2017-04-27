package leetcode;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author Eric Zhang
 * @Date 2017/3/28 19:44
 */
public class _107BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if (root==null)
            return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for (int i=0;i<levelSize;i++){
                if (queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            list.add(0,subList);
        }
        return  list;
    }
}
