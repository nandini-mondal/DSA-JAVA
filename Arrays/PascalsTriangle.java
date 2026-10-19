/*
 * Problem: LeetCode 118 - Pascal's Triangle
 *
 * Approach: Binomial Coefficient Formula
 *
 * Steps:
 * 1. Create a list to store all rows.
 * 2. Run the outer loop from i = 1 to numRows.
 * 3. Create a new list for each row and initialize result = 1.
 * 4. Run the inner loop from r = 1 to i.
 * 5. Add result to the current row.
 * 6. Calculate the next element using:
 *    result = result * (i - r) / r
 * 7. Return the complete list.
 *
 * Example:
 * Input:  numRows = 5
 * Output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            list.add(new ArrayList<>());
            int result = 1;

            for (int r = 1; r <= i; r++) {
                list.get(i - 1).add(result);
                result = result * (i - r) / r;
            }
        }

        return list;
    }
}
