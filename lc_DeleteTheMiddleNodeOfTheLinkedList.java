
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode a = head;
        ListNode b = head.next.next;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
        }
        a.next = a.next.next;
        return head;
    }
}
