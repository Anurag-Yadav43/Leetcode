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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to build the result list
        ListNode current = dummy; 
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry from the previous iteration

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate carry for the next iteration
            current.next = new ListNode(sum % 10); // Store last digit in new node
            current = current.next; // Move to the next node
        }

        return dummy.next; // Return the actual result list (skip dummy)
    }
}
