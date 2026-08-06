class Solution {
    public int smallestNumber(int n, int t) {

        int prod = 1;
        
        while( n <= 100) {
            int nums = n;
            while(nums > 0) {
                prod *= nums%10;
                nums = nums/10;
            }
            if(prod%t == 0) {
                return n;
            }
            n++;
            prod=1;
        }
        return 0;
    }
}