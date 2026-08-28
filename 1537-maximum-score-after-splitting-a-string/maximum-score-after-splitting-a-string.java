class Solution {
    public int maxScore(String s) {

        
        int s1 =0;
        int count =0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                count ++;
            }
        }

        for(int i =0;i<s.length()-1;i++) {
            if(s.charAt(i)== '0') {
                s1 ++;

            }
            else{
                count--;
            }

            int ans = s1+count;
            if(ans > max) {
                max = ans;
            }
        }

        return max;

        
    }
}