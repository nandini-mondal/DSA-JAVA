/*
 * Problem: LeetCode 73 - Set Matrix Zeroes
 *
 * Approach: Using Row and Column Arrays
 *
 * Steps:
 * 1. Create row[] and col[] arrays to mark rows and columns.
 * 2. Traverse the matrix and check for zero elements.
 * 3. If matrix[i][j] == 0, mark row[i] = 1 and col[j] = 1.
 * 4. Traverse the matrix again.
 * 5. If row[i] == 1 or col[j] == 1, set matrix[i][j] = 0.
 *
 * Example:
 * Input:
 * [[1,1,1],
 *  [1,0,1],
 *  [1,1,1]]
 *
 * Output:
 * [[1,0,1],
 *  [0,0,0],
 *  [1,0,1]]
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(m + n)
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row[] = new int[m];
        int col[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
