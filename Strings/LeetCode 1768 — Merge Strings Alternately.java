/*# LeetCode 1768 - Merge Strings Alternately

## Problem
Given two strings `word1` and `word2`, merge them by adding characters alternately, starting with `word1`.

If one string is longer, append the remaining characters at the end.

## Approach
- Use a `StringBuilder` to build the result.
- Use one index `i` for both strings.
- Continue the loop while either string has characters remaining.
- Check the bounds of each string before accessing its character.

## Example

Input:
word1 = "abc"
word2 = "pqr"

Output:
"apbqcr"

## Complexity
- Time: O(n + m)
- Space: O(n + m)

## Java Solution

```java*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }

            i++;
        }

        return result.toString();
    }
}
