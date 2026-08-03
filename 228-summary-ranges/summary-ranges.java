class Solution {
    public List<String> summaryRanges(int[] nums) {

        List <String> ans = new ArrayList<>();

        if(nums.length==0) {
            return ans;
        }

        int initial =nums[0];

        for(int i = 0; i<nums.length-1; i++) {
            
            if( (nums[i+1]-nums[i]) != 1) {

                if(nums[i] != initial ){
                    ans.add(initial+"->"+nums[i]);
                }
                else{
                    ans.add(""+initial);

                }

                initial = nums[i+1];
            }
        }

         if(initial == nums[nums.length-1]){
                ans.add(""+initial);

            }
            else{
                 ans.add(initial+"->"+nums[nums.length-1]);
            }
        return ans;
        
    }
}