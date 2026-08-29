// LeetCode 36 - Valid Sudoku
// Difficulty: Medium
// Topics: Array, Matrix, Hashing

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Track numbers already used in each row
        boolean[][] rows = new boolean[9][9];

        // Track numbers already used in each column
        boolean[][] cols = new boolean[9][9];

        // Track numbers already used in each 3x3 box
        boolean[][] boxes = new boolean[9][9];

        // Traverse every cell of the Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // Ignore empty cells
                if (board[i][j] != '.') {

                    // Convert '1' - '9' into index 0 - 8
                    int num = board[i][j] - '1';

                    // Find which 3x3 box the cell belongs to
                    // Box numbering:
                    // 0 | 1 | 2
                    // 3 | 4 | 5
                    // 6 | 7 | 8
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    // If the number already exists in the
                    // same row, column, or box, Sudoku is invalid
                    if (rows[i][num] ||
                        cols[j][num] ||
                        boxes[boxIndex][num]) {

                        return false;
                    }

                    // Mark the number as used
                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[boxIndex][num] = true;
                }
            }
        }

        // No duplicates found
        return true;
    }
}

/*
Approach:
- Use three boolean arrays to track numbers in rows, columns, and boxes.
- For every non-empty cell, check whether the number was already used.
- If found in the same row, column, or 3x3 box, return false.
- Otherwise, mark it as used.

Box Formula:
boxIndex = (row / 3) * 3 + (column / 3)

Time Complexity:
O(9 * 9) = O(1)
Since the Sudoku board is always 9x9.

Space Complexity:
O(1)
Three fixed-size 9x9 boolean arrays are used.
*/
