/*
 * LeetCode #414 - Third Maximum Number
 *
 * Approach:
 * Maintain the three largest distinct numbers using
 * first, second, and third.
 *
 * Duplicate values are ignored.
 *
 * If three distinct numbers exist, return the third maximum.
 * Otherwise, return the maximum number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            // Ignore duplicate values
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } 
            else if (second == null || n > second) {
                third = second;
                second = n;
            } 
            else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
}
