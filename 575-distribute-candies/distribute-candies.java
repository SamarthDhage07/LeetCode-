class Solution {
    public int distributeCandies(int[] candyType) {

        int n = (candyType.length)/2;
        int diff = 1;
        Arrays.sort(candyType);

        for(int i = 0 ; i <candyType.length-1;i++) {
            if(candyType[i] != candyType[i+1]) {
                diff++;
            }
        }
        if(diff <= n ) {
            return diff;
        }
        else{
            return n;
        }



    
        
    }
}