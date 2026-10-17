/*
 * Problem: LeetCode 54 - Spiral Matrix
 *
 * Approach: Boundary Traversal
 *
 * Steps:
 * 1. Initialize four boundaries: sRow, eRow, sCol, and eCol.
 * 2. Traverse the top row from left to right.
 * 3. Traverse the right column from top to bottom.
 * 4. Traverse the bottom row from right to left if rows remain.
 * 5. Traverse the left column from bottom to top if columns remain.
 * 6. Update the boundaries and repeat until all elements are visited.
 *
 * Example:
 * Input:  [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Time Complexity: O(m * n)
 * Auxiliary Space: O(1), excluding the output list.
 */

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int sRow = 0;
        int eRow = matrix.length - 1;
        int sCol = 0;
        int eCol = matrix[0].length - 1;

        while (sRow <= eRow && sCol <= eCol) {
            for (int i = sCol; i <= eCol; i++) {
                list.add(matrix[sRow][i]);
            }
            sRow++;

            for (int i = sRow; i <= eRow; i++) {
                list.add(matrix[i][eCol]);
            }
            eCol--;

            if (sRow <= eRow) {
                for (int i = eCol; i >= sCol; i--) {
                    list.add(matrix[eRow][i]);
                }
                eRow--;
            }

            if (sCol <= eCol) {
                for (int i = eRow; i >= sRow; i--) {
                    list.add(matrix[i][sCol]);
                }
                sCol++;
            }
        }

        return list;
    }
}
