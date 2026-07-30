class Solution {

     List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
        
    public void solve(int nums[], int i) {

        if(i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        //yes choice 
        list.add(nums[i]);
        solve(nums, i+1);

        list.remove(list.size()-1); // backtracking step

        // No Choice 
        solve(nums, i + 1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0);
        return ans;
    }
}