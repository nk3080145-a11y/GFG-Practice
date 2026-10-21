## 01. Search in BST

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1)

### Problem Description

**Task:** Given a Binary Search Tree and a node value key, return true if the node with value key is present in the BST; otherwise, return false.

#### Examples

##### Example 1

- **Input:**
```text
root = [6, 2, 8, N, N, 7, 9], key = 8 Output: true
```
- **Explanation:** 8 is present in the BST as right child of root.

##### Example 2

- **Input:**
```text
root = [16, 12, 18, 10, N, 17, 19], key = 14 Output: falseExplanation: 14 is not present in the BST
```

#### Constraints

- **1.** `1 ≤ number of nodes ≤ 3*10⁴¹ ≤ node- > data, key ≤ 10⁹`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(h)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-21 21:10:59
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean search(Node root, int key) {
        if(root==null) return false;
        if(root.data==key) return true;
        return (root.data<key) ? search(root.right,key) : search(root.left,key);
    }
}
```

*Generated on: 10/21/2026, 9:12:21 PM*