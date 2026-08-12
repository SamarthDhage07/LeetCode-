class Solution {
    public String getHint(String secret, String guess) {

        int X = 0;
        int Y = 0;
        String ans = "";

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                X++;
            }
        }

        char[] nums1 = secret.toCharArray();
        char[] nums2 = guess.toCharArray();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                i++;
                j++;
                Y++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        Y -= X;

        return ans += "" + X + "A" + Y + "B";

    }
}