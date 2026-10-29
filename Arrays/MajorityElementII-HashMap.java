```java
/*
 * Problem: LeetCode 229 - Majority Element II
 *
 * Approach: HashMap
 *
 * Steps:
 * 1. Create a list to store majority elements.
 * 2. Create a HashMap to store element frequencies.
 * 3. Traverse the array.
 * 4. Skip elements already present in the result list.
 * 5. Update the frequency using getOrDefault().
 * 6. If frequency > nums.length / 3, add the element to the list.
 * 7. Return the list.
 *
 * Example:
 * Input: nums = [1, 2, 1, 3, 1]
 * Output: [1]
 *
 * Time Complexity: O(n) on average
 * Auxiliary Space Complexity: O(n)
 */

import java.util.*;
public class MajorityElementIIHashMap {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > nums.length / 3) {
                list.add(nums[i]);
            }
        }

        return list;
    }
}
```
