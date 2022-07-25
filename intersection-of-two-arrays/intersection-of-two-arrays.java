class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        
        for(int i : nums1){
            set.add(i);
            
        }
        
        HashSet<Integer> inter = new HashSet<Integer>();
        
        for(int i: nums2){
            if(set.contains(i)){
                inter.add(i);
            }
        }
        
        int[] result = new int[inter.size()];
        int index = 0;
        
        for(int i : inter){
            result[index++] = i;
        }
        return result; 
    }
}