## 01. Count BST Nodes in Range

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1)

### Problem Description

**Task:** Given a Binary Search Tree (BST) and a range l-h (inclusive), your task is to return the number of nodes in the BST whose value lie in the given range. Examples :Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 5, h = 45

#### Examples

##### Example 1

- **Output:**
```text
3
```
- **Explanation:** There are three nodes in range [5, 45] = 5, 10 and 40.

##### Example 2

- **Input:**
```text
root[] = [10, 5, 50, 1, N, 40, 100], l = 10, h = 100
```
- **Output:**
```text
0Explanation: There are no nodes in range [23, 95].
```
- **Explanation:** There are four nodes in range [10, 100] = 10, 40, 50 and 100.Input: root[] = [1, 2, 3], l = 23, h = 95

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-21 22:18:29
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    int getCount(Node root, int l, int h) {
        if(root==null) return 0;
        int count = 0;
        if(root.data>=l && root.data<=h) count++;
        if(root.data>l) count += getCount(root.left,l,h);
        if(root.data<h) count += getCount(root.right,l,h);
        return count;
    }
}
```

*Generated on: 10/21/2026, 10:18:43 PM*