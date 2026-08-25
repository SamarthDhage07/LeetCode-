class Solution {
    public int missingMultiple(int[] nums, int k) {

        for(int i =0;i<nums.length;i++) {
            if(nums[i]%k==0) {
                nums[i]/=k;
            }
            else{
                nums[i]=-1;
            }
        }
        Arrays.sort(nums);
        int count=1;
        for(int i =0;i<nums.length;i++) {

            if( nums[i]!=-1) {
                if(nums[i]==count){
                    count++;
                }
                else if(nums[i]<count)continue;
                else{
                    return (count)*k;
                }
            
            }

        }

        return (count)*k;
        
    }
}