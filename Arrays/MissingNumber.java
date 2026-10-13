/*
 * LeetCode 268 - Missing Number
 *
 * Approach:
 * ----------
 * Use XOR to find the missing number.
 * XOR of two identical numbers is 0, and XOR with 0 gives the number itself.
 *
 * Steps:
 * ----------
 * 1. Initialize n = nums.length.
 * 2. Initialize xor = n.
 * 3. Traverse the array from index 0 to n - 1.
 * 4. XOR xor with the current index i.
 * 5. XOR xor with the current array element nums[i].
 * 6. Return xor, which contains the missing number.
 *
 * Example:
 * ----------
 * Input:  nums = [3, 0, 1]
 * Output: 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}
