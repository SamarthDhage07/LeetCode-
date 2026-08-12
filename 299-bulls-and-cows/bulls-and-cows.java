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

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(int i =0;i<secret.length();i++) {
            nums1[secret.charAt(i)-'0']++;
        }
        for(int i =0;i<guess.length();i++) {
            nums2[guess.charAt(i)-'0']++;
        }

        for(int i =0;i<nums1.length;i++) {
            if(nums1[i] >0 && nums2[i] >0) {
                Y += Math.min(nums1[i], nums2[i]);
            }
        }
        Y -= X;

        return ans += "" + X + "A" + Y + "B";

    }
}