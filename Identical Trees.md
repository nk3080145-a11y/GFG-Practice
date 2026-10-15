## 01. Identical Trees

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1)

### Problem Description

**Task:** Given two binary trees with their root nodes r1 and r2, return true if both of them are identical, otherwise return false.Note: Two trees are identical when they have the same data and the arrangement of the data is also same.Examples:Input: r1 = [1, 2, 3, 4], r2 = [1, 2, 3, 4]Output: true

#### Examples

##### Example 1

- **Output:**
```text
false
```
- **Explanation:** Trees are not identical.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-13 22:44:51
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data!=r2.data) return false;
        return (isIdentical(r1.left,r2.left)) && (isIdentical(r1.right,r2.right));
    }
}
```

*Generated on: 10/15/2026, 6:15:23 PM*