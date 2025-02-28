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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // Edge case
        
        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare first half and reversed second half
        ListNode firstHalf = head;
        ListNode temp = secondHalf; // To restore list later
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // (Optional) Step 4: Restore the list back to original
        reverseList(temp);

        return true; // It's a palindrome
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
