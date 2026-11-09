/*
 * LeetCode 389: Find the Difference
 *
 * Approach: Bit Manipulation (XOR)
 *
 * Steps:
 * 1. Initialize result = 0.
 * 2. Traverse string s using a while loop.
 * 3. Get characters from both strings at the current index.
 * 4. Apply XOR to both characters and store the result.
 * 5. XOR the extra character from string t.
 * 6. Return the result after typecasting it to char.
 *
 * Example:
 * Input: s = "abcd", t = "abcde"
 * Output: 'e'
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

public class FindTheDifferenceXOR {

    public char findTheDifference(String s, String t) {
        int result = 0;
        int i = 0;

        while(i < s.length()) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            result ^= ch1;
            result ^= ch2;

            i++;
        }

        result ^= t.charAt(i);

        return (char)result;
    }
}
