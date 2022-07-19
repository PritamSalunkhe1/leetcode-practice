class Solution {
    public int firstUniqChar(String s) {
        
        int index = -1;
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            
            
            int freq = map.getOrDefault(c,0);
            
            map.put(c,(freq+1));
            
            
            
        }
        
        for(int i =0 ; i<s.length();i++){
            if(map.get(s.charAt(i))== 1){
                index =i;
                break;
            }
            
        }
        return index;
    }
}