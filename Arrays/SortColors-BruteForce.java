/*
Problem: LeetCode 75 - Sort Colors

Approach: Counting Approach

Steps:
1. Initialize three counters: count0, count1, and count2.
2. Traverse the array and count the occurrences of 0, 1, and 2.
3. Initialize j = 0 to track the position to update.
4. Place all 0s at the beginning of the array.
5. Place all 1s after the 0s.
6. Place all 2s in the remaining positions.

Example:
Input: [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]

Time Complexity: O(n)
Auxiliary Space Complexity: O(1)
*/

import java.util.*;
class SortColorsCounting {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count0++;
            }
            else if(nums[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }

        int j = 0;

        while(count0 > 0) {
            nums[j] = 0;
            j++;
            count0--;
        }

        while(count1 > 0) {
            nums[j] = 1;
            j++;
            count1--;
        }

        while(count2 > 0) {
            nums[j] = 2;
            j++;
            count2--;
        }
    }
}
