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
    public int numComponents(ListNode head, int[] nums) {

        ArrayList<Integer> ll = new ArrayList<>();
        ListNode temp = head;

        for(int i =0;i<nums.length;i++) {
            ll.add(nums[i]);
        }

        int count =0;
        int innercnt = 0;

        while(temp != null) {
            if(ll.contains(temp.val)) {
                innercnt ++;
                if(innercnt == 1) {
                    count++;
                }
            }
            else{
                innercnt = 0;
            }

            temp = temp.next;
        }

        return count;
        
    }
}