/*
 * LeetCode 9: Palindrome Number
 *
 * Approach: Number Reversal
 *
 * Steps:
 * 1. If the number is negative, return false.
 * 2. Store the original number in a separate variable.
 * 3. Initialize rev = 0 to store the reversed number.
 * 4. Extract the last digit using num % 10.
 * 5. Remove the last digit using num / 10.
 * 6. Build the reversed number using rev = rev * 10 + l_digit.
 * 7. Compare the reversed number with the original number.
 * 8. If both are equal, return true; otherwise, return false.
 *
 * Example:
 * Input: x = 121
 * Reversed: 121
 * Output: true
 *
 * Time Complexity: O(log10 n)
 * Auxiliary Space Complexity: O(1)
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int num = x;
        int rev = 0;

        while(num > 0) {
            int l_digit = num % 10;
            num = num / 10;
            rev = rev * 10 + l_digit;
        }

        if(rev == x) {
            return true;
        }

        return false;
    }
}
