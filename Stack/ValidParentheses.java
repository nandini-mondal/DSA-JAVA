/*
 * LeetCode 20 - Valid Parentheses
 *
 * Approach:
 * ----------
 * We use a Stack to keep track of opening brackets.
 *
 * Steps:
 * ----------
 * 1. Create an empty Stack.
 * 2. Traverse the string character by character.
 * 3. If the character is an opening bracket, push it into the stack.
 * 4. If it is a closing bracket:
 *    - Check whether the stack is not empty.
 *    - Check whether the top bracket matches.
 *    - If it matches, pop the bracket.
 *    - Otherwise, return false.
 * 5. After traversing the string, check the stack.
 * 6. If the stack is not empty, return false.
 * 7. Otherwise, return true.
 *
 * Example:
 * ----------
 * Input:  s = "()[]{}"
 * Output: true
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if (!st.isEmpty() &&
                    (st.peek() == '(' && ch == ')' ||
                     st.peek() == '{' && ch == '}' ||
                     st.peek() == '[' && ch == ']')) {
                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }

        if (!st.isEmpty()) {
            return false;
        }

        return true;
    }
}
