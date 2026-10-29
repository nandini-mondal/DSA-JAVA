```java
/*
 * Problem: LeetCode 229 - Majority Element II
 *
 * Approach: Extended Boyer-Moore Voting Algorithm
 *
 * Steps:
 * 1. Maintain two candidates and their counts.
 * 2. Match the current element with either candidate and
 *    increase its count.
 * 3. If a candidate's count is zero, replace that candidate.
 * 4. If neither candidate matches, decrease both counts.
 * 5. Traverse the array again to count actual frequencies.
 * 6. Add candidates whose frequency is greater than n / 3.
 * 7. Return the result list.
 *
 * Example:
 * Input: nums = [3, 2, 3]
 * Output: [3]
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1), excluding output space.
 */

import java.util.*;
public class MajorityElementIIBoyerMoore {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int ele1 = 0;
        int ele2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i]) {
                count1++;
            } else if (ele2 == nums[i]) {
                count2++;
            } else if (count1 == 0) {
                ele1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                ele2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i]) {
                count1++;
            } else if (ele2 == nums[i]) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            list.add(ele1);
        }

        if (count2 > nums.length / 3) {
            list.add(ele2);
        }

        return list;
    }
}
```
