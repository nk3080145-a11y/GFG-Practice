## 01. BST Insert

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1)

### Problem Description

**Task:** Given a root of Binary Search Tree (BST) and an integer key, insert a new node with value key into the BST. Return the root of the modified tree after the insertion.

> **Note:** If the key is already present in the BST, return the root.

#### Examples

##### Example 1

- **Input:**
```text
root = [2, 1, 3], key = 4
```
- **Output:**
```text
[2, 1, 3, N, N, N, 4]
```
- **Explanation:** After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4].

##### Example 2

- **Input:**
```text
root = [2, 1, 3, N, N, N, 6], key = 4Output: [2, 1, 3, N, N, N, 6, 4]
```
- **Explanation:** After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 6, 4].

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(h)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-22 20:40:57
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public void build(Node root,int key){
        if(root.data==key) return;
        if(root.data<key){
            if(root.right==null) root.right = new Node(key);
            else build(root.right,key);
        }
        else{
            if(root.left==null) root.left = new Node(key);
            else build(root.left,key);
        }
    }
    public Node insert(Node root, int key) {
        build(root,key);
        return root;
    }
}
```

*Generated on: 10/22/2026, 8:41:11 PM*