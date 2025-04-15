// Last updated: 4/15/2025, 1:12:19 PM
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
        List<Integer> arr = new ArrayList<>();
        int index = 0; 
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            arr.add(index,slow.val );
            index++;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }

        int i =arr.size()-1;
        while(slow != null && i >= 0){
            if(arr.get(i) == slow.val){
                slow = slow.next;
                i--;
            }
            else return false;
        }

        return true;



    }
}