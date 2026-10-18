## 01. Min Distance Between Two in Binary Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1)

### Problem Description

**Task:** Given a binary tree with n nodes and two node values a and b, find the minimum distance between them. The distance is defined as the minimum number of edges between the two nodes. It is guaranteed that both nodes exist in the binary tree and all node values are unique.If two given nodes are same, return 0.Examples :Input:
a = 2, b = 3

#### Examples

##### Example 1

- **Output:**
```text
4
```
- **Explanation:** The path between node 4 and node 7 is: 4 - > 2 - > 1 - > 3 - > 7.The number of edges in this path is 4, so the minimum distance is 4.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(Height of the Tree)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-18 21:53:22
- **Status:** Correct
- **Marks:** 8

```java
class Solution {
    public void dfs(Node root,int a , int b, int level, int[] arr){
        if(root==null) return;
        if(root.data==a) arr[0] = level;
        if(root.data==b) arr[1] = level;
        dfs(root.left,a,b,level+1,arr);
        dfs(root.right,a,b,level+1,arr);
    }
    public int findDist(Node root, int a, int b) {
        if(root==null) return 0;
        Node LCA = lca(root,a,b);
        int[] arr = {0,0};
        dfs(LCA,a,b,0,arr);
        return arr[0]+arr[1];
    }
    public Node lca(Node root,int a, int b){
        if(root==null) return null;
        if(root.data==a || root.data==b) return root;
        Node l = lca(root.left,a,b);
        Node r = lca(root.right,a,b);
        if(l!=null && r!=null) return root;
        return (l==null) ? r : l;
    }
}
```

*Generated on: 10/18/2026, 9:53:15 PM*