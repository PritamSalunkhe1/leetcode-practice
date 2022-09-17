class Solution {

    public boolean containsDuplicate(int[] nums) {
        //we took n as the length of nums array
        int n = nums.length;
        //then we declared hashset with integer as set
        Set<Integer> set = new HashSet<>();
        //we started for loop in the array and check if the element is present in set.
        //if element not present , add element , if element present return true, else return false

        //hashset only stores unique elements.
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
