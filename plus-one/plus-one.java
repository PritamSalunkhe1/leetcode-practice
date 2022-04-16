class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 1;
        for (; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (i >= 0) {
            return digits;
        }

        int[] res = new int[n + 1];
        res[0] = 1;
        for (i = 1; i < n + 1; i++) {
            res[i] = digits[i - 1];
        }
        return res;
    }
}
