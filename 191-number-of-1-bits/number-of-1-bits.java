class Solution {
    public int hammingWeight(int n) {


        ArrayList<Integer> ll = new ArrayList<>();

        while(n != 0) {
            ll.add(n%2);
            n = n/2;
        }

        if( n == 0 ) {
            ll.add(0);
        }

        Collections.reverse(ll);

        int count=0;

        for(int i =0;i<ll.size();i++) {
            if(ll.get(i)== 1) count++;
        }



        return count;

    }
}