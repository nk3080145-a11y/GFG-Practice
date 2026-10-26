## 01. Delete from BST

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/delete-a-node-from-bst/1)

### Problem Description

**Task:** Given a binary search tree and a node value x. Delete the node with the given value x from the tree. If no node with value x exists, then do not make any change.
Return the root of the tree after deleting the node with value x.

> **Note:** You may return any valid BST after deleting the specified node. The driver code will print true if the resulting tree is a valid BST after deletion, and false otherwise.

#### Examples

##### Example 1

- **Input:**
```text
root = [2, 1, 3], x = 12
```
- **Output:**
```text
true
```
- **Explanation:** In the given input there is no node with value 12, so the tree will remain same.

##### Example 2

- **Input:**
```text
root = [1, N, 2, N, 8, 5, 11, 4, 7, 9, 12], x = 11
```
- **Output:**
```text
trueExplanation: In the given input, one of the possible tree after deleting 11 will be
```

##### Example 3

- **Input:**
```text
root = [2, 1, 3], x = 3Output: [2, 1]Explanation: In the given input, only possible tree after deleting 3 will be
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(Height of the BST)
- **Expected Auxiliary Space Complexity:** O(Height of the BST)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-26 21:28:52
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public Node delNode(Node root, int tar) {
        if(root==null) return null;
        if(root.data>tar){
            root.left = delNode(root.left,tar);
        }
        else if(root.data<tar){
            root.right = delNode(root.right,tar);
        }
        else{
            if(root.left==null && root.right==null) return null;
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            Node pred = root.left;
            while(pred.right!=null) pred = pred.right;
            root.left = delNode(root.left,pred.data);
            pred.left = root.left;
            pred.right = root.right;
            return pred;
        }
        return root;
    }
}
```

*Generated on: 10/26/2026, 9:29:05 PM*