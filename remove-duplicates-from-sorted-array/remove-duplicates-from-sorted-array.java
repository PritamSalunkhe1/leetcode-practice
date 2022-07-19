class Solution {

    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (curr == nums[i]) {
                continue;
            } else {
                nums[count] = nums[i];
                curr = nums[i];
                count++;
            }
        }
        return count;
    }
}
