/*
 * LeetCode #1502 - Can Make Arithmetic Progression From Sequence
 *
 * Approach:
 * Sort the array first. Then calculate the common difference
 * between the first two elements.
 *
 * Traverse the remaining elements and check whether every
 * consecutive pair has the same difference.
 *
 * If any difference is different, return false.
 * Otherwise, return true.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n) auxiliary space
 */

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}
