/*
 * Problem: LeetCode 229 - Majority Element II
 *
 * Approach: Brute Force
 *
 * Steps:
 * 1. Create a list to store majority elements.
 * 2. Traverse the array using the outer loop.
 * 3. Skip elements already present in the list.
 * 4. Count the frequency of each element using the inner loop.
 * 5. If count > nums.length / 3, add the element to the list.
 * 6. Stop when two majority elements are found.
 * 7. Return the list.
 *
 * Example:
 * Input: nums = [3, 2, 3]
 * Output: [3]
 *
 * Time Complexity: O(n^2)
 * Auxiliary Space Complexity: O(1), excluding output space.
 */

import java.util.*;
public class MajorityElementIIBruteForce {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 3) {
                list.add(nums[i]);
            }

            if (list.size() == 2) {
                break;
            }
        }

        return list;
    }
}
