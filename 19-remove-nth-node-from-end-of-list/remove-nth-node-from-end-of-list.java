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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        
        int size = 0;

        while(temp != null) {
            size++; 
            temp = temp.next;
            
        }

        if(n == size) {
            return head.next;
        }

        int j = 1;
        int iToFind = size - n;
        ListNode prev = head;
        while(j<iToFind) {
            prev = prev.next;
            j++;
        }

        prev.next = prev.next.next;
        return head;
    }
}