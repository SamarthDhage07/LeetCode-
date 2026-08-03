class Solution {
    public String largestOddNumber(String num) {

        String ans ="";
        int idx=-1;

        for(int i =0;i<num.length();i++) {
            if((num.charAt(i)-'0')%2 != 0) {
                idx = i;
            }
        }

        if(idx == 0) {
            return ans+num.charAt(0);
        }

        for(int i =0 ;i<=idx;i++) {
            ans += num.charAt(i);
        }

        return ans;
        
    }
}