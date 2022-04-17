class Solution {

    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = n - 1; i > 1; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }
}
