class Solution {
    public int maxProduct(int[] nums) {

        int larg= Integer.MIN_VALUE;
        int prevl = Integer.MIN_VALUE;
        int ans=0;

        for(int i =0;i<nums.length;i++) {
            if(nums[i]>larg){
                prevl = larg;
                larg = nums[i];
            }
            else if(nums[i]>prevl && nums[i]<=larg){
                prevl=nums[i];
            }
        }

        return ((prevl-1)*(larg-1));
    }
}