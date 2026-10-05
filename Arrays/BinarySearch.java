/*
 * LeetCode 704 - Binary Search
 *
 * Approach:
 * ----------
 * We use Binary Search because the array is sorted.
 *
 * Steps:
 * ----------
 * 1. Set `si` to the first index.
 * 2. Set `ei` to the last index.
 * 3. Find the middle index.
 * 4. Compare nums[mid] with target.
 *    - If equal, return mid.
 *    - If nums[mid] > target, search the left half.
 *    - Otherwise, search the right half.
 * 5. If the target is not found, return -1.
 *
 * Example:
 * ----------
 * Input:  nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {

        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {

            int mid = (si + ei) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return -1;
    }
}
