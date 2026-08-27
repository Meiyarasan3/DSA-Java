class Solution {
    public int lengthOfLastWord(String s) {

        String S = s.trim();

        String[] w = S.split(" ");

        return w[w.length - 1].length();
    }
}
## Approach

1. Remove leading and trailing spaces using `trim()`.
2. Split the string into individual words using `split(" ")`.
3. Access the last word using `w[w.length - 1]`.
4. Return its length using `length()`.

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

Where `n` is the length of the input string.
