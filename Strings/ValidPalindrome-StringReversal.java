/*
 * LeetCode 125: Valid Palindrome
 *
 * Approach: String Reversal
 *
 * Steps:
 * 1. Convert the string to lowercase.
 * 2. Remove all non-alphanumeric characters.
 * 3. Reverse the cleaned string using StringBuilder.
 * 4. Compare the original cleaned string with the reversed string.
 * 5. If both are equal, return true; otherwise, return false.
 *
 * Example:
 * Input: "A man, a plan, a canal: Panama"
 * Cleaned: "amanaplanacanalpanama"
 * Output: true
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(n)
 */

public class ValidPalindromeStringReversal {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String result = sb.toString();

        if (s.equals(result)) {
            return true;
        }

        return false;
    }
}
