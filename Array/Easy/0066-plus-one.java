// ═════════════════════════════════════════════════════════════════
// 66. 66. Plus One
// ═════════════════════════════════════════════════════════════════
// Difficulty: Easy
// Topics: Array, Math
//
// Runtime: 0 ms
// Acceptance Rate: 48.7%
//
// LeetCode: https://leetcode.com/problems/plus-one/description/
// Synced: 2026-01-01T06:52:43.872Z
// ═════════════════════════════════════════════════════════════════

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }