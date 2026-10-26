/*
Problem: LeetCode 560 - Subarray Sum Equals K

Approach: Brute Force (Running Sum)

Steps:
1. Initialize count = 0 to count valid subarrays.
2. Use the outer loop to select the starting index i.
3. Initialize sum = 0 for each starting index.
4. Use the inner loop to extend the subarray from i to j.
5. Add nums[j] to the running sum.
6. If sum == k, increment count.
7. Continue checking all possible subarrays.
8. Return count.

Example:
Input: nums = [1, 1, 1], k = 2
Output: 2

Time Complexity: O(n^2)
Auxiliary Space Complexity: O(1)
*/

import java.util.*;
class SubarraySumEqualsKBruteForce {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            int sum = 0;

            for(int j = i; j <= nums.length - 1; j++) {
                sum += nums[j];

                if(sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
