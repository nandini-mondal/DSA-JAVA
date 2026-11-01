/*
 * LeetCode 1903: Largest Odd Number in String
 *
 * Approach: Greedy (Right-to-Left Traversal)
 *
 * Steps:
 * 1. Traverse the string from right to left.
 * 2. Convert each character into an integer digit.
 * 3. Check whether the digit is odd.
 * 4. If an odd digit is found, return the substring from index 0 to i+1.
 * 5. If no odd digit is found, return an empty string.
 *
 * Example:
 * Input: num = "35427"
 * Output: "35427"
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1), excluding the returned substring.
 */

public class LargestOddNumber {

    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            if(digit % 2 != 0) {
                return num.substring(0, i+1);
            }
        }

        return "";
    }
}
