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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int nums[] = {-1,-1};
        if(head == null) {
            return nums;
        }

        int min = Integer.MAX_VALUE;
        ListNode temp = head;
        int size =0;
        ArrayList<Integer> ll = new ArrayList<>();
        
        while(temp != null) {
            size ++;
            temp= temp.next;
        }

        if(size <3) {
            return nums;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode agee = head.next.next;
        int count =1;

        while(agee != null) {
            if(curr.val < prev.val && curr.val < agee.val) {
                ll.add(count);
            }

            if(curr.val > prev.val && curr.val > agee.val) {
                ll.add(count);
            }

            prev = curr;
            curr = agee;
            agee = agee.next;

            count++;
        }

        if(ll.size() < 2) return nums;
        
        int maxDistance = ll.get(ll.size()-1) - ll.get(0);

        for(int i =1;i<ll.size();i++) {
            int minD = ll.get(i)-ll.get(i-1);
            if(minD<min) {
                min= minD;
            } 
        }

        nums[0]=min;
        nums[1]=maxDistance;

        return nums;
        
    }
}