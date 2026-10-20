/*
 * Problem: LeetCode 48 - Rotate Image
 *
 * Approach: Transpose + Reverse Each Row
 *
 * Steps:
 * 1. Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
 * 2. Start j from i to avoid swapping elements twice.
 * 3. Reverse each row using two pointers, fp and lp.
 * 4. Swap elements until fp >= lp.
 * 5. The matrix is rotated 90 degrees clockwise.
 *
 * Example:
 * Input:
 * [[1,2,3],
 *  [4,5,6],
 *  [7,8,9]]
 *
 * Output:
 * [[7,4,1],
 *  [8,5,2],
 *  [9,6,3]]
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int temp = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    continue;
                } else {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            int fp = 0;
            int lp = n;
            int swap = 0;

            while (fp < lp) {
                swap = matrix[i][fp];
                matrix[i][fp] = matrix[i][lp];
                matrix[i][lp] = swap;

                fp++;
                lp--;
            }
        }
    }
}
