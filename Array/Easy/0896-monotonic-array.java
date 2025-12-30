// ═════════════════════════════════════════════════════════════════
// 896. 896. Monotonic Array
// ═════════════════════════════════════════════════════════════════
// Difficulty: Easy
// Topics: Array
//
// Runtime: 3 ms
// Memory: 85.04 MB
// Acceptance Rate: 62.1%
//
// LeetCode: https://leetcode.com/problems/monotonic-array/submissions/1869359102/
// Synced: 2025-12-30T12:23:11.142Z
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