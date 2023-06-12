class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode odd=head;
        ListNode eve=head.next;
        ListNode ans=eve;
        while(eve!=null&&eve.next!=null){
           odd.next=eve.next;
        odd=odd.next;
           eve.next=odd.next;
           eve=eve.next;
        }
        odd.next=ans;
        return head;
    }
}
