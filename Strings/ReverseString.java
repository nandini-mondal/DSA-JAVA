/*
 * LeetCode 344: Reverse String
 *
 * Approach: Two Pointers (In-Place Reversal)
 *
 * Steps:
 * 1. Initialize two pointers: i at the beginning and j at the end.
 * 2. Run a loop while i < j.
 * 3. Store s[i] in a temporary variable.
 * 4. Swap s[i] and s[j].
 * 5. Move both pointers inward.
 * 6. Continue until the pointers meet or cross.
 *
 * Example:
 * Input: ['h', 'e', 'l', 'l', 'o']
 * Output: ['o', 'l', 'l', 'e', 'h']
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

public class ReverseString {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
