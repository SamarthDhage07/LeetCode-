class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);
        int count =nums[0];  
        int i =0;        
        while(i <nums.length) {        
            if(nums[i] != count) {   
                ans.add(count);
            }
            else{
                i++; 
            }
            count++;
        }
        return ans;   
    }
}