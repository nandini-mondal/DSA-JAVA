/*
 * LeetCode 26 - Remove Duplicates from Sorted Array
 *
 * Approach:
 * ----------
 * Use two pointers to remove duplicates in-place from the sorted array.
 *
 * Steps:
 * ----------
 * 1. If the array is empty, return 0.
 * 2. Initialize j = 0 and i = 1.
 * 3. Traverse the array using i.
 * 4. If nums[i] != nums[j], copy nums[i] to nums[j + 1] and increment j.
 * 5. Increment i in every iteration.
 * 6. Return j + 1, the number of unique elements.
 *
 * Example:
 * ----------
 * Input:  nums = [1, 1, 2]
 * Output: 2
 *
 * Modified array: [1, 2, ...]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                nums[j + 1] = nums[i];
                j++;
            }

            i++;
        }

        return j + 1;
    }
}
