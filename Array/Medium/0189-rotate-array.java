// ═════════════════════════════════════════════════════════════════
// 189. 189. Rotate Array
// ═════════════════════════════════════════════════════════════════
// Difficulty: Medium
// Topics: Array, Math, Two Pointers
//
// Runtime: 0 ms
// Acceptance Rate: 44.1%
//
// LeetCode: https://leetcode.com/problems/rotate-array/description/
// Synced: 2025-12-30T12:24:02.891Z
// ═════════════════════════════════════════════════════════════════

class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        System.arraycopy(nums, n - k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, n - k);
        System.arraycopy(temp, 0, nums, 0, n);
}
}