class Solution {

    public int mostWordsFound(String[] sentences) {
        int maxword = 0;
        for (int i = 0; i < sentences.length; i++) {
            if ((wordCount(sentences[i]) > maxword)) {
                maxword = wordCount(sentences[i]);
            }
        }
        return maxword;
    }

    public static int wordCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
