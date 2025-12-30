// ═════════════════════════════════════════════════════════════════
// 896. 896. Monotonic Array
// ═════════════════════════════════════════════════════════════════
// Difficulty: Easy
// Topics: Array
//
// Acceptance Rate: 62.1%
//
// LeetCode: https://leetcode.com/problems/monotonic-array/description/
// Synced: 2025-12-30T12:22:41.219Z
// ═════════════════════════════════════════════════════════════════

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) inc = false;
            if (nums[i] > nums[i - 1]) dec = false;
        }
        return inc || dec;
    }