class Solution {

    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[lo] <= nums[mid]) { //means left is sorted
                if (target >= nums[lo] && target < nums[mid]) { //checking if target lies betn lo to mid
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (nums[hi] >= nums[mid]) { //means right is sorted
                if (target > nums[mid] && target <= nums[hi]) { //checking if target lies betn mid to hi.
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
