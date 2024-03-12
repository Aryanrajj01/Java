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
…                if(sum==0){
                    c.next = r.next;
                }
                r=r.next;
            }
            c= c.next;
        }
        return d.next;
    }
}
