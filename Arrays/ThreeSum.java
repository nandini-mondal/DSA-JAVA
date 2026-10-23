/*
Problem: LeetCode 15 - 3Sum

Approach: Sorting + Two Pointers

Steps:
1. Sort the array.
2. Fix the first element using i.
3. Use j and k pointers to find two numbers whose sum
   with nums[i] equals zero.
4. Skip duplicate values to avoid duplicate triplets.
5. If the sum is zero, add the triplet to the result.
6. If the sum is positive, decrement k.
7. If the sum is negative, increment j.
8. Return the list of unique triplets.

Example:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]

Time Complexity: O(n^2)
Auxiliary Space Complexity: O(1), excluding sorting
and the output list.
*/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if(nums[i] > 0) {
                break;
            }

            int k = nums.length - 1;
            int j = i + 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    list.add(new ArrayList<>(
                        List.of(nums[i], nums[j], nums[k])
                    ));

                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
                else if(sum > 0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }

        return list;
    }
}
