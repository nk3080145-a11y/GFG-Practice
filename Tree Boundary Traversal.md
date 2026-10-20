## 01. Tree Boundary Traversal

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1)

### Problem Description

**Task:** Given a root of a Binary Tree, return its boundary traversal in the following order:
Left Boundary: Nodes from the root to the leftmost non-leaf node, preferring the left child over the right and excluding leaves.
Leaf Nodes: All leaf nodes from left to right, covering every leaf in the tree.
Reverse Right Boundary: Nodes from the root to the rightmost non-leaf node, preferring the right child over the left, excluding leaves, and added in reverse order.

> **Note:** The root is included once, leaves are added separately to avoid repetition, and the right boundary follows traversal preference not the path from the rightmost leaf.

#### Examples

##### Example 1

- **Input:**
```text
root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
```
- **Output:**
```text
[1, 2, 4, 8, 9, 6, 7, 3]
```

##### Example 2

- **Input:**
```text
root = [1, N, 2, N, 3, N, 4, N, N]
```
- **Output:**
```text
[1, 4, 3, 2]
```
- **Explanation:** Left boundary: [1] (as there is no left subtree) Leaf nodes: [4] Right boundary: [3, 2] (in reverse order) Final traversal: [1, 4, 3, 2]

#### Constraints

- **1.** `1 ≤ number of nodes ≤ 10⁵¹ ≤ node- > data ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-20 11:42:43
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left==null && root.right==null) return ans;
        leftBoundary(root.left,ans);
        nodeBoundary(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    public void leftBoundary(Node root,ArrayList<Integer> ans){
        while(root!=null){
            if(root.left==null && root.right==null) break;
            ans.add(root.data);
            if(root.left!=null) root = root.left;
            else root = root.right;
        }
    }
    public void nodeBoundary(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        nodeBoundary(root.left,ans);
        nodeBoundary(root.right,ans);
    }
    public void rightBoundary(Node root,ArrayList<Integer> ans){
        ArrayList<Integer> helper = new ArrayList<>();
        while(root!=null){
            if(root.left==null && root.right==null) break;
            helper.add(root.data);
            if(root.right!=null) root = root.right;
            else root = root.left;
        }
        int n = helper.size()-1;
        for(int i=n;i>=0;i--){
            int temp = helper.get(i);
            ans.add(temp);
        }
    }
    // public ArrayList<Integer> boundaryTraversal(Node root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(root.data);
    //     if(root.left==null && root.right==null) return ans;
    //     leftBoundary(root.left,ans);
    //     nodeBoundary(root,ans);
    //     rightBoundary(root.right,ans);
    //     return ans;
    // }
    // public void leftBoundary(Node root,ArrayList<Integer> ans){
    //     if(root==null) return;
    //     if(root.left==null && root.right==null) return;
    //     ans.add(root.data);
    //     if(root.left!=null) leftBoundary(root.left,ans);
    //     else leftBoundary(root.right,ans);
    // }
    // public void nodeBoundary(Node root, ArrayList<Integer> ans){
    //     if(root==null) return;
    //     if(root.left==null && root.right==null) ans.add(root.data);
    //     nodeBoundary(root.left,ans);
    //     nodeBoundary(root.right,ans);
    // }
    // public void rightBoundary(Node root,ArrayList<Integer> ans){
    //     if(root==null) return;
    //     if(root.left==null && root.right==null) return;
    //     if(root.right!=null) rightBoundary(root.right,ans);
    //     else rightBoundary(root.left,ans);
    //     ans.add(root.data);
    // }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-20 11:26:22
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left==null && root.right==null) return ans;
        leftBoundary(root.left,ans);
        nodeBoundary(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    public void leftBoundary(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    public void nodeBoundary(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        nodeBoundary(root.left,ans);
        nodeBoundary(root.right,ans);
    }
    public void rightBoundary(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
        ans.add(root.data);
    }
}
```

*Generated on: 10/20/2026, 11:42:40 AM*