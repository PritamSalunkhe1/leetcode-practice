class Solution {

    public void reverseString(char[] s) {
        int i = 0;
        int n = s.length - 1;
        char temp = 'a';
        while (i <= n) {
            temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            i++;
            n--;
        }
    }
}
