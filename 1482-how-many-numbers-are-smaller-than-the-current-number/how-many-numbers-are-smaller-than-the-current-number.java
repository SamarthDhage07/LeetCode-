class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int count = 0;
        int numsCount =0;
        int ans[] = new int[nums.length]; 

        for(int i =0 ;i<nums.length;i++) {
            for(int j = 0 ; j<nums.length; j++) {

                if(nums[j] < nums[i]){
                    count++;
                }
            }

            ans[numsCount] = count;
            count = 0;
            numsCount++;
        } 
        
        return ans;
    }
}