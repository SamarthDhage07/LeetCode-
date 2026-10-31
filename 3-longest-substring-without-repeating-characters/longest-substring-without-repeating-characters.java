class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[128];
        int left = 0;
        int largest = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while (freq[ch] == 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            freq[ch]++;
            largest = Math.max(largest, right - left + 1);
        }

        return largest;
    }
}