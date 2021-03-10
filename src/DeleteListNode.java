/**
 * @author zhaohj
 * @date 2021-03-10 10:06 下午
 * @Description 删除链表的节点
 */

public class DeleteListNode {
    /**
     *
     * @param head 头节点
     * @param val 删除的节点值
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        //双指针写法
        ListNode pre=null;
        ListNode cur=head;
        while (cur.val!=val){
            pre=cur;
            cur=cur.next;
        }
        if (cur==head){
            head=head.next;
        }else {
            pre.next=cur.next;
        }
        return head;
    }
    //
    public ListNode deleteNode2(ListNode head, int val) {
        //每次删除头节点
        if (head==null) {
            return null;
        }
        if (head.val==val) {
            return head.next;
        }
        head.next=deleteNode(head.next,val);
        return head;
    }

    /**
     *
     * @param node 要删除的节点
     */
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
