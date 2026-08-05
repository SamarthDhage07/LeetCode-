class Solution {
    public String reverseWords(String s) {

        boolean isEnd = false;
        int end = s.length() - 1;
        StringBuilder ans = new StringBuilder();

        for (int i = s.length()-1;i>=0;i--) {

            if (s.charAt(i) != ' ' && !isEnd) {
                end = i;
                isEnd = true;
                if (ans.length() != 0)
                    ans.append(" ");
            }

            if (s.charAt(i) == ' ' && isEnd) {
                ans.append(s.substring(i +1, end+1));
                isEnd = false;
            }
            if (i == 0 && isEnd) {
                ans.append(s.substring(0,end + 1));
            }
        }

        return ans.toString();
    }
}