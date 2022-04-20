public class Solution {

    public int hammingWeight(int n) {
        int sum = 0;
        while (n!=0) {
            sum = sum + (n & 1);
            n = n >>> 1;
        }
        return sum;
    }
}
