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
    public ListNode partition(ListNode head, int x) {

        
        ListNode temp = head;
        ListNode dummyL= new ListNode(-1);
        ListNode headL = dummyL;
        ListNode dummyR= new ListNode(-1);
        ListNode headR = dummyR;

        while(temp != null) {
            if(temp.val < x) {
                ListNode newNode = new ListNode(temp.val);
                dummyL.next =  newNode;
                dummyL = dummyL.next;
            }
            else{
                ListNode newNode = new ListNode(temp.val);
                dummyR.next =  newNode;
                dummyR = dummyR.next;
            }
            temp=temp.next;
        }
        
        dummyR.next = null;
        dummyL.next = headR.next;

        return headL.next;
    }
}