class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int prod = 1;
        int ans=n;

        while(n>0) {
            int reminder = n%10;
            sum += reminder ;
            prod *= reminder;
            n=n/10;
        }

        return ans%(sum+prod) == 0;
        
    }
}