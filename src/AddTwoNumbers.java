/**
 * @author zhaohj
 * @date 2021-03-14 9:58 下午
 * @Description 两数之和
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode cursor=root;
        //进位标记 当temp不等于0时也要计算一次
        int temp=0;
        while (l1!=null||l2!=null||temp!=0){
            int l1Val=l1!=null?l1.val:0;
            int l2Val=l2!=null?l2.val:0;
            int sum=l1Val+ l2Val+temp;
            temp=sum/10;
            ListNode sumNode=new ListNode(sum%10);
            cursor.next=sumNode;
            cursor=sumNode;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return root.next;
    }
}
