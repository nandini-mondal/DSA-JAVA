/*
 * Problem: LeetCode 169 - Majority Element
 *
 * Approach: Boyer-Moore Voting Algorithm
 *
 * Steps:
 * 1. Initialize element as the first array element and count as 1.
 * 2. Traverse the array from index 1.
 * 3. If count becomes 0, select the current element as the candidate.
 * 4. If the current element matches the candidate, increment count.
 * 5. Otherwise, decrement count.
 * 6. Return the final candidate.
 *
 * Example:
 * Input: nums = [2, 2, 1, 1, 1, 2, 2]
 * Output: 2
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count++;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
