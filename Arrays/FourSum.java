/*
Problem: LeetCode 18 - 4Sum

Approach: Optimal Approach - Sorting + Two Pointers

Steps:
1. Sort the array in ascending order.
2. Use i and j to select the first two elements.
3. Skip duplicate values of i and j.
4. Use l and k as two pointers to find the remaining elements.
5. Calculate the sum of all four elements using long
   to prevent integer overflow.
6. If sum == target, add the quadruplet to the list.
7. If sum > target, decrement k.
8. If sum < target, increment l.
9. Skip duplicate values to avoid repeated quadruplets.
10. Return the list of unique quadruplets.

Example:
Input: nums = [1, 0, -1, 0, -2, 2], target = 0
Output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

Time Complexity: O(n^3)
Auxiliary Space Complexity: O(1), excluding sorting
implementation details and the output list.
*/

import java.util.*;
class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = nums.length - 1;
                int l = j + 1;

                while(k > l) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];

                    if(sum == target) {
                        list.add(new ArrayList<>(
                            List.of(nums[i], nums[j], nums[l], nums[k])
                        ));

                        k--;
                        l++;

                        while(k > l && nums[k] == nums[k + 1]) {
                            k--;
                        }

                        while(k > l && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }
                    else if(sum > target) {
                        k--;
                    }
                    else {
                        l++;
                    }
                }
            }
        }

        return list;
    }
}
