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
    public int getDecimalValue(ListNode head) {

        ArrayList<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        int ans=0;

        while(temp != null) {
            ll.add(temp.val);
            temp = temp.next;
        }

        int count =0;

        for(int i = ll.size()-1 ; i >=0 ; i--) {
            ans += (ll.get(i)*(int)Math.pow(2,count));
            count++; 
        }

        return ans;
    }
}