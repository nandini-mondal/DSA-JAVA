/*
 * LeetCode 50 - Pow(x, n)
 *
 * Approach:
 * ----------
 * We use Java's built-in Math.pow() method to calculate x raised to
 * the power n.
 *
 * Steps:
 * ----------
 * 1. Take x and n as input.
 * 2. Use Math.pow(x, n) to calculate the power.
 * 3. Return the result.
 *
 * Example:
 * ----------
 * Input:  x = 2.00000, n = 10
 * Output: 1024.00000
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}
