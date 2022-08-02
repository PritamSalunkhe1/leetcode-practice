class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
        
        
        
        for(int i = 0; i< s.length(); i++){
            int a = mapS.getOrDefault(s.charAt(i), -1);
            int b = mapT.getOrDefault(t.charAt(i), -1);
            
            
            if(a!=b){
                return false;
            }
            
            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
            
        }
        return true;
    }
}