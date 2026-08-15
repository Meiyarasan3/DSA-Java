/*
 * LeetCode #2574 - Left and Right Sum Differences
 *
 * Approach:
 * Calculate the total sum of the array as rightSum.
 * For each index:
 * 1. Remove the current element from rightSum.
 * 2. Calculate the absolute difference between leftSum and rightSum.
 * 3. Add the current element to leftSum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            rightSum -= nums[i];

            ans[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return ans;
    }
}
