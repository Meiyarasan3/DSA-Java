/*
 * LeetCode #136 - Single Number
 *
 * Approach: Brute Force
 *
 * For each element, count how many times it appears
 * in the array. The element that appears only once
 * is the required answer.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int a = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == a) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}
