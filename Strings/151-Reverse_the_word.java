/*
 * LeetCode #151 - Reverse Words in a String
 *
 * Approach: String Manipulation
 *
 * Split the string into words using whitespace as the delimiter.
 * Traverse the words from right to left and build the result
 * in reverse order.
 *
 * Extra spaces are automatically handled by using "\\s+".
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
