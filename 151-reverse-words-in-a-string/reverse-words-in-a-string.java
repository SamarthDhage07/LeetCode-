class Solution {
    public String reverseWords(String s) {

        boolean isEnd = false;
        int end = s.length()-1;
        String ans = "";
        int count =0;

        for(int i = s.length()-1; i >=0 ;i--) {
            if((s.charAt(i) != ' ') && isEnd == false) {
                end = i;
                isEnd = true;
                if(count!=0){
                    ans += " ";   
                }
                count=1;
            }
            if((s.charAt(i) == ' ') && isEnd == true) {
                int start = i+1;
                isEnd = false;
                ans += s.substring(start, end+1);  
            }
            if(i == 0 && isEnd == true) {
                ans += s.substring(0,end+1);
            }
        }
        return ans;
    }
}