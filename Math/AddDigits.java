/*
 * LeetCode 258 - Add Digits
 *
 * Approach:
 * ----------
 * We repeatedly calculate the sum of the digits until only one digit remains.
 *
 * Steps:
 * ----------
 * 1. Store `num` in `temp`.
 * 2. While `temp` has more than one digit:
 *    - Set `sum = 0`.
 *    - Extract each digit using `temp % 10`.
 *    - Add the digit to `sum`.
 *    - Remove the last digit using `temp /= 10`.
 * 3. Set `temp = sum`.
 * 4. Repeat until `temp` becomes a single digit.
 * 5. Return `temp`.
 *
 * Example:
 * ----------
 * Input:  num = 38
 * Output: 2
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int addDigits(int num) {

        int temp = num;

        while (temp > 9) {

            int sum = 0;

            while (temp > 0) {

                int lastDigit = temp % 10;

                temp /= 10;

                sum += lastDigit;
            }

            temp = sum;
        }

        return temp;
    }
}
