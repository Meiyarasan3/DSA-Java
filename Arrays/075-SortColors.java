/*
 * LeetCode #75 - Sort Colors
 *
 * Approach: Counting
 *
 * Count the number of 0s, 1s, and 2s.
 * Then overwrite the array in sorted order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0s, 1s and 2s
        for (int num : nums) {

            if (num == 0) {
                count0++;
            } 
            else if (num == 1) {
                count1++;
            } 
            else {
                count2++;
            }
        }

        // Place 0s, 1s and 2s in sorted order
        int index = 0;

        while (count0-- > 0) {
            nums[index++] = 0;
        }

        while (count1-- > 0) {
            nums[index++] = 1;
        }

        while (count2-- > 0) {
            nums[index++] = 2;
        }
    }
}
