class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        // Find the indices of the minimum and maximum elements
        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[left]) {
                left = i;
            }

            if (nums[i] > nums[right]) {
                right = i;
            }
        }

        // Make left the larger index and right the smaller index
        if (left < right) {
            int temp = left;
            left = right;
            right = temp;
        }

        int ans = n;

        /*
         * Try removing elements from the front.
         * i represents the number of elements removed from the front.
         *
         * If the smaller index is already removed,
         * we only need to remove from the back to remove the other element.
         */
        for (int i = 0; i <= n; i++) {
            int extra = 0;

            if (right >= i) {
                extra = n - right;
            } else if (left >= i) {
                extra = n - left;
            }

            ans = Math.min(ans, i + extra);
        }

        return ans;
    }
}

# LeetCode 2091 - Removing Minimum and Maximum From Array

## Approach

The goal is to remove both the minimum and maximum elements using deletions
only from the front or back of the array.

### Steps

1. Find the index of the minimum element.
2. Find the index of the maximum element.
3. Consider the possible deletions from the front.
4. After removing elements from the front, calculate how many elements
   must be removed from the back.
5. Keep track of the minimum number of deletions.

### Time Complexity

O(n)

We scan the array to find the minimum and maximum positions and then
evaluate the possible deletion counts.

### Space Complexity

O(1)

Only a few integer variables are used.
