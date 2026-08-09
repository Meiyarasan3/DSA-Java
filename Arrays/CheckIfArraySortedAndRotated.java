/*
 * LeetCode #1752 - Check if Array Is Sorted and Rotated
 *
 * Approach: Count Decreasing Pairs
 *
 * A sorted array rotated any number of times can have
 * at most one position where nums[i] > nums[i + 1].
 *
 * We also compare the last element with the first element
 * using circular indexing.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean check(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
