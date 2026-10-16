/*
 * Problem: LeetCode 2149 - Rearrange Array Elements by Sign
 *
 * Approach: Two Pointers
 *
 * Steps:
 * 1. Use p to find positive elements and n to find negative elements.
 * 2. Store positive and negative elements alternately in a new array.
 * 3. Start with a positive element.
 * 4. Continue until the result array is filled.
 *
 * Example:
 * Input:  [3, 1, -2, -5, 2, -4]
 * Output: [3, -2, 1, -5, 2, -4]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 0;
        int[] result = new int[nums.length];
        int i = 0;

        while (i < nums.length) {
            if (i == 0 || result[i - 1] < 0) {
                while (p < nums.length && nums[p] < 0) {
                    p++;
                }

                result[i] = nums[p];
                i++;
                p++;
            } else {
                while (n < nums.length && nums[n] > 0) {
                    n++;
                }

                result[i] = nums[n];
                i++;
                n++;
            }
        }

        return result;
    }
}
