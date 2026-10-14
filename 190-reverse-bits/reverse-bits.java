
import java.util.ArrayList;

class Solution {
    public int reverseBits(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        int sum = 0;
        int count = 31;

        while (count >= 0) {
            int remainder = n & 1;
            ll.add(remainder);
            n = n >>> 1;
            count--;
        }

        count = 31;

        for (int i = 0; i < ll.size(); i++) {
            sum |= ll.get(i) << count;
            count--;
        }

        return sum;
    }
}
