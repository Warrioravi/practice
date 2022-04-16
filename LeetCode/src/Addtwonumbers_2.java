public class Addtwonumbers_2 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode currNode=ans;
        int carry=0;
        while(!(l1==null&&l2==null)){
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            currNode.val=sum%10;
            currNode.next= new ListNode();
            currNode=currNode.next;
        }
        return  ans;
    }

}
