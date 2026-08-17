/*
 * LeetCode #455 - Assign Cookies
 *
 * Approach: Greedy
 *
 * Sort the children by greed factor and cookies by size.
 * Start from the greediest child and the largest cookie.
 *
 * If the largest cookie can satisfy the current child,
 * assign it and move to the next child and cookie.
 *
 * Otherwise, the current child cannot be satisfied by
 * any remaining cookie, so skip that child.
 *
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(1) auxiliary space
 */

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookiesNums = s.length;

        if (cookiesNums == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int maxNum = 0;
        int cookieIndex = cookiesNums - 1;
        int childIndex = g.length - 1;

        while (cookieIndex >= 0 && childIndex >= 0) {
            if (s[cookieIndex] >= g[childIndex]) {
                maxNum++;
                cookieIndex--;
                childIndex--;
            } else {
                childIndex--;
            }
        }

        return maxNum;
    }
}
