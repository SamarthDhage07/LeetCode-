class Solution {
    public int maxDigitRange(int[] nums) {  
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> diff = new ArrayList<>();
        int ans = 0;
        int larg = Integer.MIN_VALUE;
        int sum =0;


        for(int i =0;i<nums.length;i++) {
            list.clear() ;
            int n = nums[i];

            while(n != 0) {
                list.add(n%10);
                n = n/10;
            }
            Collections.sort(list);

            diff.add(list.get(list.size()-1)-list.get(0));

        }

        for(int i=0; i<diff.size();i++) {
            if(diff.get(i) > larg ) {
                larg = diff.get(i);
            }
        }

        for(int i =0;i<nums.length;i++) {
            if(diff.get(i) == larg) {
                sum +=nums[i];
            }
        }
        return sum;
        
    }
}