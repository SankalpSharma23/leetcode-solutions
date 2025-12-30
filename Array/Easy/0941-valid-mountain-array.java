// ═════════════════════════════════════════════════════════════════
// 941. 941. Valid Mountain Array
// ═════════════════════════════════════════════════════════════════
// Difficulty: Easy
// Topics: Array
//
// Acceptance Rate: 34.8%
//
// LeetCode: https://leetcode.com/problems/valid-mountain-array/description/
// Synced: 2025-12-30T12:22:51.963Z
// ═════════════════════════════════════════════════════════════════

class Solution {
    public boolean validMountainArray(int[] arr) {
             if (arr.length < 3) return false;
    int left =0;int right =arr.length-1;
    while(left+1< arr.length &&arr[left]<arr[left+1])left++;
    while(right>0&&arr[right]<arr[right-1])right--;
    return(left>0 && right<arr.length -1 && left==right);
}
    
}