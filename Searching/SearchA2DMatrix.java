/*
 * LeetCode 74 - Search a 2D Matrix
 *
 * Approach:
 * Treat the 2D matrix as a sorted 1D array
 * and apply binary search.
 *
 * Steps:
 * 1. Set the search range from 0 to rows * cols - 1.
 * 2. Find the middle index.
 * 3. Convert the 1D index into row and column:
 *      row = mid / cols
 *      col = mid % cols
 * 4. Compare the matrix element with target.
 * 5. Adjust the search range accordingly.
 *
 * Example:
 * matrix = [[1,3,5],
 *           [7,9,11]]
 * target = 9
 *
 * Output: true
 *
 * Complexity:
 * Time: O(log(m * n))
 * Space: O(1)
 */

class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int si = 0;
        int ei = rows * cols - 1;

        while(si <= ei){

            int mid = (si + ei) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] < target){
                si = mid + 1;
            }
            else{
                ei = mid - 1;
            }
        }

        return false;
    }
}
