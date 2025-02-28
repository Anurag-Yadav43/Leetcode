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
    public ListNode reverseList(ListNode head) {
        //iterative approach
        // ListNode prev = null;
        // ListNode current = head;
        // ListNode next = null;

        // while(current != null){
        //     next = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = next;

        // }
        // return prev;


        //reccursive approach
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);

        // Reverse the link
        head.next.next = head;
        head.next = null; 

        return newHead;
    }
}