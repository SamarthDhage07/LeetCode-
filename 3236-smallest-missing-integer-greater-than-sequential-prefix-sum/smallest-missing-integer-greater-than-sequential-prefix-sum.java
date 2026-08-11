class Solution {
    public int missingInteger(int[] nums) {

        int count = 0;
        int sum=nums[0];
        int large = Integer.MIN_VALUE;

        if(nums.length == 1) return nums[0]+1;

        for(int i = 1; i<nums.length;i++) {
            if(nums[i]-nums[i-1]==1) {
                sum += nums[i];
            }
            else{
                break;
            }
        }

        int ans = sum ;

        Arrays.sort(nums);

        for(int i =0;i<nums.length;i++) {
            if(nums[i] == ans ){
               ans +=1;
            }
        }
        return ans;
        
    }
}