## 01. Check for BST

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/check-for-bst/1)

### Problem Description

**Task:** Given a binary tree, check whether it is a Binary Search Tree (BST) or not. A binary tree is considered a BST if it satisfies the following properties:All nodes in the left subtree of a node have values less than the node's value.All nodes in the right subtree of a node have values greater than the node's value.Both the left and right subtrees are also Binary Search Trees.Return true if the given binary tree is a BST; otherwise, return false.Examples:Input: root = [2, 1, 3, N, N, N, 5]

#### Examples

##### Example 1

- **Output:**
```text
false
```
- **Explanation:** The node with data 9 present in the right subtree has lesser key value than root node 10.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 18:43:23
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public void helper(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
    public boolean isBST(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        boolean flag = true;
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1)) flag = false;
        }
        return flag;
    }
}
```

*Generated on: 10/23/2026, 6:43:35 PM*