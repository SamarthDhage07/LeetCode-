class Solution {
    public int maxDigitRange(int[] nums) {

        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {

            int n = num;

            if (n == 0) {
                if (maxRange < 0) {
                    maxRange = 0;
                    sum = num;
                } else if (maxRange == 0) {
                    sum += num;
                }
                continue;
            }

            int minDigit = 9;
            int maxDigit = 0;

            while (n > 0) {
                int digit = n % 10;
                minDigit = Math.min(minDigit, digit);
                maxDigit = Math.max(maxDigit, digit);
                n /= 10;
            }

            int range = maxDigit - minDigit;

            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange) {
                sum += num;
            }
        }

        return sum;
    }
}