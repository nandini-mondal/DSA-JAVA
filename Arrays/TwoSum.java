/*
 * LeetCode 167 - Two Sum II: Input Array Is Sorted
 *
 * Approach:
 * ----------
 * The array is sorted, so we can use the Two Pointer approach.
 *
 * 1. Initialize `fp` at the first element.
 * 2. Initialize `lp` at the last element.
 * 3. Calculate the sum of numbers[fp] and numbers[lp].
 *
 *    - If sum == target:
 *        Pair is found.
 *
 *    - If sum > target:
 *        Move `lp` to the left to decrease the sum.
 *
 *    - If sum < target:
 *        Move `fp` to the right to increase the sum.
 *
 * 4. Continue until the required pair is found.
 * 5. Return 1-based indices as required by LeetCode.
 *
 * Example:
 * ----------
 * Input:  numbers = [2, 7, 11, 15], target = 9
 * Output: [1, 2]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fp = 0;
        int lp = numbers.length - 1;

        while (fp <= lp) {
            if (numbers[fp] + numbers[lp] == target) {
                break;
            } 
            else if (numbers[fp] + numbers[lp] > target) {
                lp--;
            } 
            else {
                fp++;
            }
        }

        return new int[]{fp + 1, lp + 1};
    }
}
