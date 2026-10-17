## 01. Full Binary Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/full-binary-tree/1)

### Problem Description

**Task:** Given a Binary Tree, check whether it is a full binary tree or not. A full binary tree is a binary tree with either zero or two child nodes for each node.

#### Examples

##### Example 1

- **Input:**
```text
root = [1, 2, 3, 4, 5]
```
- **Output:**
```text
true
```
- **Explanation:** Every node except leaf node has two children so it is a full tree.

##### Example 2

- **Input:**
```text
root = [1, 2, 3, 4]
```
- **Output:**
```text
false
```
- **Explanation:** Node 2 has only one child so this is not a full tree.

#### Constraints

- **1.** `1 ≤ number of nodes ≤ 1000`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-10-17 11:57:35
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public boolean isFullTree(Node root) {
        if(root==null) return false;
        if(root.left==null && root.right==null)  return true;
        return (isFullTree(root.left) && (isFullTree(root.right)));
    }
};
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-17 11:57:01
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public boolean isFullTree(Node root) {
        if(root==null) return false;
        if(root.left==null && root.right==null)  return true;
        return (isFullTree(root.left) && (isFullTree(root.right)));
    }
};
```

#### Solution 3 (Java)

- **Submitted:** 2026-10-17 11:55:13
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean isFullTree(Node root) {
        if(root==null) return false;
        if(root.left==null && root.right==null)  return true;
        return (isFullTree(root.left) && (isFullTree(root.right)));
    }
};
```

*Generated on: 10/17/2026, 12:03:08 PM*