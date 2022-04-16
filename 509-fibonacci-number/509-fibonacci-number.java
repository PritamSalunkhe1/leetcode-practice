class Solution {

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fiba = fib(n - 1);
        int fibb = fib(n - 2);
        int fibc = fiba + fibb;

        return fibc;
    }
}
