/*
Problem: LeetCode 75 - Sort Colors

Approach: Dutch National Flag Algorithm (Three Pointers)

Steps:
1. Initialize low = 0, mid = 0, and high = nums.length - 1.
2. Traverse the array while mid <= high.
3. If nums[mid] == 0, swap nums[low] and nums[mid],
   then increment low and mid.
4. If nums[mid] == 1, increment mid.
5. If nums[mid] == 2, swap nums[mid] and nums[high],
   then decrement high.
6. Do not increment mid after swapping 2 because the
   swapped element has not been checked yet.
7. Continue until mid > high.

Example:
Input: [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]

Time Complexity: O(n)
Auxiliary Space Complexity: O(1)
*/

import java.util.*;
class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
    }
}
