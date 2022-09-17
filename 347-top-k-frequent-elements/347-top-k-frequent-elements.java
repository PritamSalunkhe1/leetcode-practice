class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        //declare a bucket in which index represents freq

        List<Integer>[] bucket = new List[nums.length + 1];

        //hashmap to calc freq
        HashMap<Integer, Integer> hm = new HashMap<>();
        //calc freq using for loop
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        //adding in bucket
        for (int key : hm.keySet()) {
            int freq = hm.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int ans[] = new int[k];
        int count = 0;

        //storing values in ans , going from right to left
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    ans[count++] = bucket[i].get(j);
                }
            }
            if (count == k) break;
        }
        return ans;
    }
}
