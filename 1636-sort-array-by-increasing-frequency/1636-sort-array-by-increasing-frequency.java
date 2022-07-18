class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> countsMap = new HashMap<>();
        
        for(int num:nums) {
            countsMap.put(num, countsMap.getOrDefault(num,0)+1);
        }
            
      return  countsMap.entrySet().stream()
          .sorted(((Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2)
                    ->  (e1.getValue()==e2.getValue()) ?  e2.getKey() - e1.getKey() :  e1.getValue() - e2.getValue()                                  ))
            .flatMap( entry -> Collections.nCopies(entry.getValue(),entry.getKey()).stream())
            .mapToInt(v -> v)
          .toArray();
        
    }
}
