/*
 * LeetCode 485 - Max Consecutive Ones
 *
 * Approach:
 * ----------
 * Traverse the array and count consecutive 1s.
 * Track the maximum count and reset the current count whenever 0 is encountered.
 *
 * Steps:
 * ----------
 * 1. Initialize count = 0 and max = 0.
 * 2. If the current element is 1, increment count.
 * 3. If the current element is 0, update max and reset count = 0.
 * 4. Return Math.max(count, max) to handle consecutive 1s at the end.
 *
 * Example:
 * ----------
 * Input:  nums = [1, 1, 0, 1, 1, 1]
 * Output: 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        return Math.max(count, max);
    }
}
