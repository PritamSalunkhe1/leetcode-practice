class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                int k = nums[i] + nums[j];
                if (i == j) {
                    continue;
                }
                if (k == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 0 };
    }
}
