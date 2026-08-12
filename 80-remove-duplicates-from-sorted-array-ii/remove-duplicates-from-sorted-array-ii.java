class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        boolean atMost2 = false;

        for (int i = 1; i<nums.length ;i++) {
            if (nums[i] == nums[i-1] && atMost2 == false) {
                nums[count]= nums[i];
                atMost2 = true;
                count++;
                
            }
            else if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                atMost2 = false;
                count++;
            }
        }
        return count;
        
    }
}