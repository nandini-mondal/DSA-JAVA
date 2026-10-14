/*
 * LeetCode 189 - Rotate Array
 *
 * Approach:
 * ----------
 * Use the Reversal Algorithm to rotate the array to the right by k positions.
 *
 * Steps:
 * ----------
 * 1. If the array is empty, return.
 * 2. Calculate k = k % nums.length.
 * 3. Reverse the first nums.length - k elements.
 * 4. Reverse the last k elements.
 * 5. Reverse the entire array to get the final result.
 *
 * Example:
 * ----------
 * Input:  nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) {
            return;
        }

        k = k % nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        int temp;

        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            j--;
            i++;
        }
    }
}
