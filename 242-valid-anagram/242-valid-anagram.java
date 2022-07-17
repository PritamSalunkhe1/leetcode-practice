import java.util.ArrayList;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            arr.add(t.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) 
            if (arr.contains(s.charAt(i))) {
            arr.remove((Character.valueOf(s.charAt(i))));
        } else return false;

        return arr.isEmpty();
    }
}
