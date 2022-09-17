import java.util.ArrayList;

class Solution {

    public boolean isAnagram(String s, String t) {
        //if length not equal, strings wont be pangrams

        if (s.length() != t.length()) {
            return false;
        }
        // declare arraylist of chars , added all elements of one string

        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            arr.add(t.charAt(i));
        }
        //removed elements from arrlist that are present in second string.
        for (int i = 0; i < s.length(); i++) if (arr.contains(s.charAt(i))) {
            arr.remove((Character.valueOf(s.charAt(i))));
        } else return false;
        //if the arrlist will be empty, it will mean that all elements of s were present in t, hence we'll return
        return arr.isEmpty();
    }
}
