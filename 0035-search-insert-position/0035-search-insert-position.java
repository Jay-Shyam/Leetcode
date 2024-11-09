class Solution {
    public int searchInsert(int[] nums, int target) {
        // Check each element from start
        for (int i = 0; i < nums.length; i++) {
            // If we find target or a number greater than target
            // this is where target should be
            if (nums[i] >= target) {
                return i;
            }
        }
        // If we didn't find any number >= target
        // target should be inserted at the end
        return nums.length;
    }
}