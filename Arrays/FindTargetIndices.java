/*
 * Problem: LeetCode 2089 - Find Target Indices After Sorting Array
 *
 * Approach: Sorting and Linear Search
 *
 * Steps:
 * 1. Create an empty list to store the target indices.
 * 2. Sort the array in ascending order.
 * 3. Traverse the sorted array.
 * 4. If nums[i] == target, add index i to the list.
 * 5. If nums[i] > target, break the loop because all
 *    following elements will also be greater than target.
 * 6. Return the list.
 *
 * Example:
 * Input:  nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n) worst case for the output list,
 *                   excluding sorting space.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            } else if (nums[i] > target) {
                break;
            }
        }

        return list;
    }
}
