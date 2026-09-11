class Solution {
    public int[] countBits(int n) {

        int ans [] = new int [n+1];
        int i =0;
        int count=0;

        while(i <= n) {
            int sum = 0;
            int j = i;
            while(j>0) {
                sum += j%2;
                j = j/2;
            }
            
            ans[count] = sum ;
            count ++;
            i++;
        }

        return ans;
        
    }
}