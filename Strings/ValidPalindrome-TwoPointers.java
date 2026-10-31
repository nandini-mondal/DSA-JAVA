/*
 * LeetCode 125: Valid Palindrome
 *
 * Approach: Two Pointers
 *
 * Steps:
 * 1. Initialize two pointers: i at the beginning and j at the end.
 * 2. Skip characters that are not alphanumeric.
 * 3. Convert both characters to lowercase and compare them.
 * 4. If they are different, return false.
 * 5. Otherwise, move both pointers inward.
 * 6. If the loop completes, return true.
 *
 * Example:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

public class ValidPalindromeTwoPointers {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}
