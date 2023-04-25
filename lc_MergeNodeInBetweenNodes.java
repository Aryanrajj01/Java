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
    public ListNode mergeNodes(ListNode head) {
    ListNode cur;
    ListNode r = new ListNode();
	cur = r;
    int sum = 0;
    while(head!=null){
        if(head.val==0 && sum!=0){
            cur.next = new ListNode(sum);
            cur = cur.next;
            sum = 0;
        }
        sum+=head.val;
        head = head.next;
    }
    return r.next;
    }
}/*
ListNode t=new ListNode(0),ans=t;
        while(head!=null){
            if(head.val!=0) t.val=t.val+head.val;
            else if(head.next!=null){
                t.next=new ListNode(0);
                t=t.next;
            }
            head=head.next;
        }
        return ans.next;
      
        ListNode curr, root = new ListNode();
	curr = root;
    int sum = 0;
    while(head!=null){
        if(head.val==0 && sum!=0){
            curr.next = new ListNode(sum);
            curr = curr.next;
            sum = 0;
        }
        sum+=head.val;
        head = head.next;
    }
    return root.next;

      */
