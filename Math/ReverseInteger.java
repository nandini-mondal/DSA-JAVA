/*
 * LeetCode 7 - Reverse Integer
 *
 * Approach:
 * ----------
 * Reverse the digits of an integer while checking for 32-bit integer overflow.
 *
 * Steps:
 * ----------
 * 1. Initialize rev = 0.
 * 2. Extract the last digit using x % 10.
 * 3. Remove the last digit using x /= 10.
 * 4. Check whether reversing the next digit will cause overflow.
 * 5. If overflow occurs, return 0.
 * 6. Otherwise, update rev = rev * 10 + lastDigit.
 * 7. Repeat until x becomes 0.
 * 8. Return rev.
 *
 * Example:
 * ----------
 * Input:  x = 123
 * Output: 321
 *
 * Time Complexity: O(log |x|)
 * Space Complexity: O(1)
 */

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && lastDigit > 7) ||
                rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
        }

        return rev;
    }
}
