public class AddTwoNumbers {
  public static void main(String[] args) {

  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode curNode = dummyHead;
        while (p != null || q != null){
            int x = (p != null)? p.val : 0;
            int y = (p != null)? p.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curNode.next = new ListNode(sum%10);
            curNode = curNode.next;
            if(p!= null ) p = p.next;
            if(q!= null) q = q.next;
        }
        if(carry>0){
            curNode.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
