class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                // Target lies in the sorted left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}


# LeetCode 33 - Search in Rotated Sorted Array

## Approach
Use modified binary search.

In a rotated sorted array, at least one half of the current search space is always sorted.

1. Find the middle element.
2. If `nums[mid] == target`, return `mid`.
3. Check which half is sorted.
4. If the left half is sorted:
   - Check whether the target lies in the left half.
   - If yes, search left; otherwise search right.
5. Otherwise, the right half is sorted:
   - Check whether the target lies in the right half.
   - If yes, search right; otherwise search left.

## Complexity

- Time: `O(log n)`
- Space: `O(1)`
