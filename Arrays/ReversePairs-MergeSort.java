```java
/*
 * Problem: LeetCode 493 - Reverse Pairs
 *
 * Approach: Modified Merge Sort
 *
 * Steps:
 * 1. Divide the array into two halves using merge sort.
 * 2. Recursively count reverse pairs in the left half.
 * 3. Recursively count reverse pairs in the right half.
 * 4. Count cross reverse pairs using two pointers.
 * 5. Merge both sorted halves.
 * 6. Return the total count.
 *
 * Reverse Pair Condition:
 * nums[i] > 2 * nums[j], where i < j.
 *
 * Time Complexity: O(n log n)
 * Auxiliary Space Complexity: O(n)
 */

import java.util.*;
public class ReversePairsMergeSort {

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;
        int count = 0;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);

        merge(nums, low, mid, high);

        return count;
    }

    public int countPairs(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        return count;
    }

    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }

        while (j <= high) {
            temp.add(nums[j]);
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            nums[low + k] = temp.get(k);
        }
    }
}
```
