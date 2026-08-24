class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        String[] charToWord = new String[26];

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            int index = ch - 'a';

            if (charToWord[index] != null) {
                if (!charToWord[index].equals(word)) {
                    return false;
                }
            }

            for (int j = 0; j < 26; j++) {
                if (word.equals(charToWord[j]) && j != index) {
                    return false;
                }
            }

            charToWord[index] = word;
        }

        return true;
    }
}

/*
Logic:

Split the string into individual words.
Check whether the number of words matches the pattern length.
Use a String[26] array to map each pattern character to a word.
If a character is already mapped, verify that it maps to the same word.
Search the array to ensure the same word is not mapped to another character.
If all mappings are valid, return true.

Example:

pattern = "abba"
s = "dog cat cat dog"

a → dog
b → cat

Output:

true

Time Complexity: O(26 × n) → O(n)

Space Complexity: O(n) in the worst case because the array stores the mapped words.
*/
