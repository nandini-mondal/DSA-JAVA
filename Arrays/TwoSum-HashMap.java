/*
 * Problem: LeetCode 1 - Two Sum
 *
 * Approach: HashMap
 *
 * Steps:
 * 1. Create a HashMap to store numbers and their indices.
 * 2. Calculate the required number: target - nums[i].
 * 3. Check whether the required number exists in the map.
 * 4. If found, return the required number's index and the current index.
 * 5. Otherwise, store the current number and its index.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int rem;

        for (int i = 0; i < nums.length; i++) {
            rem = target - nums[i];

            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
