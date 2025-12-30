// ═════════════════════════════════════════════════════════════════
// 19. 19. Remove Nth Node From End of List
// ═════════════════════════════════════════════════════════════════
// Difficulty: Medium
// Topics: Linked List, Two Pointers
//
// Runtime: 0 ms
// Acceptance Rate: 50.5%
//
// LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Synced: 2025-12-30T12:37:52.375Z
// ═════════════════════════════════════════════════════════════════

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode current = head;
    int length = 0;
    
    if (n == length) {
        return head.next;
    }
    ListNode prev = head;
    for (int i = 0; i < length - n - 1; i++) {