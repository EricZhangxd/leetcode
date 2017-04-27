package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/21 14:45
 */
public class _21MergeTwoSortedLists {
    public static void main(String[] args) {

    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        else if (l2==null)
            return l1;
        ListNode mergeHead;
        if (l1.val>l2.val)
        {
            mergeHead=l2;
            mergeHead.next=mergeTwoLists(l1,l2.next);
        }
        else {
            mergeHead=l1;
            mergeHead.next=mergeTwoLists(l1.next,l2);
        }
        return  mergeHead;
    }

    public ListNode mergeTwoList2(ListNode l1,ListNode l2){
        if (l1==null)
            return l2;
        else if (l2==null)
            return l1;
        ListNode result=new ListNode(0);
        ListNode prev=result;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                prev=l1;
                l1=l1.next;
            }
            else {
                prev=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        if (l1!=null)
            prev.next=l1;
        if (l2!=null)
            prev.next=l2;
        return result.next;
    }
}
