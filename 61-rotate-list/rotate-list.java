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
    public ListNode rotateRight(ListNode head, int k) {

        if (head ==null || head.next ==null || k== 0) {
            return head;
        }

        ListNode curr = head;
        int size=0;
        ListNode temp = head;
        ListNode tempu = head;

        while(temp != null) {
            size ++;
            temp = temp.next;
        }

        k = k % size;

        if(k == 0) {
            return head;
        }

        int count = size - k;
        int i =1;

        while(i < count) {
            i++;
            tempu = tempu.next;
        }
        ListNode NullKarnaHai = tempu;
        ListNode right = tempu.next;  
        ListNode prev = null;

        while(right != null) {
            ListNode next = right.next;
            right.next = prev;
            prev = right ;
            right = next;
        }

        head = prev ;
        NullKarnaHai.next = null;

        while(prev != null) {
            ListNode next = prev.next;
            prev.next = curr;
            curr = prev;
            prev = next;
        }

        return curr;
    }
        
}