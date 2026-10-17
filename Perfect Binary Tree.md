## 01. Perfect Binary Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/perfect-binary-tree/1)

### Problem Description

**Task:** Given a Binary Tree, check whether the given Binary Tree is a prefect Binary Tree or not. A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.

#### Examples

##### Example 1

- **Input:**
```text
root[] = [7, 4, 9]
```
- **Output:**
```text
true As the root node 7 has two children and two leaf nodes 4 and 9 are at same level.
```

##### Example 2

- **Input:**
```text
root[] = [7, 3, 8, 2, 5, N, 10, 1, N, N, N, N, N]
```
- **Output:**
```text
false
```

#### Constraints

- **1.** `1 ≤ n ≤ 10⁵¹ ≤ data of node ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-17 12:19:17
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    boolean isPerfect(Node root) {
        int level = level(root);
        int size = size(root);
        if(Math.pow(2,level)-1==size) return true;
        else return false;
    }
};
```

*Generated on: 10/17/2026, 12:19:16 PM*