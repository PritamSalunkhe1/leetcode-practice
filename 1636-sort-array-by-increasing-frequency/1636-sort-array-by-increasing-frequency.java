class Solution {
    public class Pair{
        int key;
        int num;
        Pair(int key,int num){
            this.key = key;
            this.num = num;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                if(p1.key == p2.key){
                    return p2.num - p1.num;
                }else{
                    return p1.key - p2.key;
                }
            }
        });
        
        for(int i = 0;i<nums.length;i++){
            minHeap.add(new Pair(freqMap.get(nums[i]),nums[i]));
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = minHeap.poll().num;
        }
        return nums;
    }
}