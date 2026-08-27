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
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode mid;
        ListNode ans = new ListNode(0);

        while(fast != null && fast.next != null) {
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        mid = null;

        return slow;

    }
}