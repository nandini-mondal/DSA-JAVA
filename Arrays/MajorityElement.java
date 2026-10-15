/*
 * LeetCode 169 - Majority Element
 *
 * Approach:
 * ----------
 * Use a HashMap to store the frequency of each element.
 * Return the element as soon as its frequency exceeds n / 2.
 *
 * Steps:
 * ----------
 * 1. Create a HashMap to store element frequencies.
 * 2. Traverse the array.
 * 3. Increase the frequency of each element using getOrDefault().
 * 4. Check whether the frequency exceeds nums.length / 2.
 * 5. If true, return that element.
 * 6. If no majority element is found, return -1.
 *
 * Example:
 * ----------
 * Input:  nums = [3, 2, 3]
 * Output: 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}
