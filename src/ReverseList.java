/**
 * @author zhaohj
 * @date 2021-03-14 11:25 下午
 * @Description 反转链表
 */
public class ReverseList {
    //迭代法
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next=curr.next;
            //反转指针
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }

    //递归写法
    public ListNode reverseList1(ListNode head) {
        //递归终止条件
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead=reverseList1(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }


}
