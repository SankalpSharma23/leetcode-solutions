// ═════════════════════════════════════════════════════════════════
// 66. 66. Plus One
// ═════════════════════════════════════════════════════════════════
// Difficulty: Easy
// Topics: Array, Math
//
// Runtime: 0 ms
// Acceptance Rate: 48.5%
//
// LeetCode: https://leetcode.com/problems/plus-one/
// Synced: 2025-12-30T12:22:04.088Z
// ═════════════════════════════════════════════════════════════════

digits[i] = 0;
        }
        
        // If all digits were 9, we need a new array with size n+1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}