/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ListNode result = head;
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head = head.next;
        }
        Collections.sort(l);
        for(int a:l){
            temp.val = a;
            temp = temp.next;
        }
        return result;
    }
}
