/*
 * LeetCode 1 - Two Sum
 *
 * Approach:
 * ----------
 * We use the Brute Force approach to check every possible pair.
 *
 * 1. Use `i` to select the first element.
 * 2. Use `j` to check every element after `i`.
 * 3. Calculate the sum of nums[i] + nums[j].
 *
 *    - If sum == target:
 *        Pair is found, so return their indices.
 *
 *    - If sum != target:
 *        Continue checking the next pair.
 *
 * 4. If no pair is found, return {-1, -1}.
 *
 * Example:
 * ----------
 * Input:  nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
