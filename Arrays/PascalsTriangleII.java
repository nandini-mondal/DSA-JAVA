/*
 * Problem: LeetCode 119 - Pascal's Triangle II
 *
 * Approach: Binomial Coefficient Formula
 *
 * Steps:
 * 1. Initialize result = 1, the first element of the row.
 * 2. Run a loop from r = 0 to rowIndex.
 * 3. Add result to the list.
 * 4. Calculate the next element using:
 *    result = result * (n - r) / (r + 1)
 * 5. Return the list.
 *
 * Example:
 * Input:  rowIndex = 3
 * Output: [1, 3, 3, 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int n = rowIndex;
        long result = 1;

        for (int r = 0; r <= n; r++) {
            list.add((int) result);
            result = result * (n - r) / (r + 1);
        }

        return list;
    }
}
