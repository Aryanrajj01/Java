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
…        ListNode nextFirst = firstHalf.next;
        ListNode nextSecond = secondHalf.next;
        firstHalf.next = secondHalf;
        secondHalf.next = nextFirst;
        firstHalf = nextFirst;
        secondHalf = nextSecond;
    }
    }
}
