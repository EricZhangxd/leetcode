package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/24 20:44
 */
public class _83RemoveDuplicatesFromSortedList {


    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(1);
        ListNode e=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        a=deleteDuplicates(a);
        while (a!=null){
            System.out.println(a.val);
            a=a.next;
        }

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead=head;
        ListNode temp;
        if (head==null)
            return head;
        while (head.next!=null){
            temp=head.next;
            if (temp.val==head.val){
                if (temp.next!=null){
                    head.next=temp.next;
                }
                else head.next=null;
            }
            else head=head.next;
        }
        return newHead;
    }
}
