/*
 * LeetCode #9 - Palindrome Number
 *
 * Approach: Reverse the number
 *
 * Logic:
 * 1. Store the original number in a temporary variable.
 * 2. Extract the last digit using x % 10.
 * 3. Build the reversed number using rev = rev * 10 + lastdigit.
 * 4. Remove the last digit using x / 10.
 * 5. Compare the reversed number with the original number.
 * 6. If both are equal, the number is a palindrome.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;

        while (temp > 0) {
            int lastdigit = temp % 10;
            rev = (rev * 10) + lastdigit;
            temp = temp / 10;
        }

        return x == rev;
    }
}
