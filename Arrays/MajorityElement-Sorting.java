/*
 * Problem: LeetCode 169 - Majority Element
 *
 * Approach: Sorting
 *
 * Steps:
 * 1. Sort the array in ascending order.
 * 2. The majority element must occupy the middle index.
 * 3. Return the element at index nums.length / 2.
 *
 * Example:
 * Input: nums = [2, 2, 1, 1, 1, 2, 2]
 * Sorted: [1, 1, 1, 2, 2, 2, 2]
 * Output: 2
 *
 * Time Complexity: O(n log n)
 * Auxiliary Space Complexity: O(log n)
 */

import java.util.Arrays;

public class MajorityElementSorting {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
