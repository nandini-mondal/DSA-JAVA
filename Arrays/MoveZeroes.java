/*
 * LeetCode 283 - Move Zeroes
 *
 * Approach:
 * ----------
 * Use a temporary array to store non-zero elements in their original order.
 * Copy them back into the original array and fill the remaining positions with zeros.
 *
 * Steps:
 * ----------
 * 1. Create a temporary array of the same size as nums.
 * 2. Initialize j = 0 and count = 0.
 * 3. Traverse nums:
 *    - If the element is non-zero, store it in temp[j] and increment j.
 *    - Otherwise, increment count.
 * 4. Copy the non-zero elements from temp back into nums.
 * 5. Fill the remaining positions with zeros.
 *
 * Example:
 * ----------
 * Input:  nums = [0, 1, 0, 3, 12]
 * Output: [1, 3, 12, 0, 0]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            } else {
                count++;
            }
        }

        int i;

        for (i = 0; i < j; i++) {
            nums[i] = temp[i];
        }

        while (count != 0) {
            nums[i] = 0;
            i++;
            count--;
        }
    }
}
