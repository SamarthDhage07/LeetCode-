class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public void findPer(int[] nums, boolean[] visited) {

        // Base case: one permutation is complete
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Try every unused element
        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            // Choose
            visited[i] = true;
            curr.add(nums[i]);

            // Explore
            findPer(nums, visited);

            // Backtrack
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        findPer(nums, visited);

        return ans;
    }
}