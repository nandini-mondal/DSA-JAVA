/*
 * LeetCode 14: Longest Common Prefix
 *
 * Approach: Horizontal Scanning
 *
 * Steps:
 * 1. Consider the first string as the initial common prefix.
 * 2. Traverse the remaining strings one by one.
 * 3. Use startsWith() to check whether each string starts with the prefix.
 * 4. If it doesn't, remove the last character from the prefix.
 * 5. Repeat until the current string starts with the prefix.
 * 6. Return the final common prefix.
 *
 * Example:
 * Input: ["flower", "flow", "flight"]
 * Output: "fl"
 *
 * Time Complexity: O(n * m²)
 * Auxiliary Space Complexity: O(m)
 *
 * n = Number of strings
 * m = Length of the first string
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(s)) {
                s = s.substring(0, s.length()-1);
            }
        }

        return s;
    }
}
