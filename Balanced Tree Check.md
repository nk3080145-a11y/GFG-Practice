## 01. Balanced Tree Check

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1)

### Problem Description

**Task:** Given the root of a binary tree, determine if it is height-balanced or not.

> **Note:** A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

#### Examples

##### Example 1

- **Input:**
```text
root = [10, 20, 30, 40, 60]Output: true Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
```

##### Example 2

- **Input:**
```text
root = [1, 2, 3, 4, N, N, N, 5] Output: false
```
- **Explanation:** The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-17 12:50:54
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public boolean isBalanced(Node root) {
        if(root==null) return true;
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        if(Math.abs(leftLevel-rightLevel)>1) return false;
        return (isBalanced(root.left) && (isBalanced(root.right)));
    }
}
```

*Generated on: 10/17/2026, 1:18:39 PM*