## 01. Largest BST Subtree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/largest-bst/1)

### Problem Description

**Task:** Given the root of a binary tree, find the size of the largest subtree that is also a Binary Search Tree (BST). A subtree is considered a BST if, for every node in the subtree:All nodes in its left subtree have values less than the node's value.All nodes in its right subtree have values greater than the node's value.The subtree contains no duplicate values.Return the number of nodes in the largest BST subtree.Note: The size of a subtree is the total number of nodes it contains.Examples :Input: root = [5, 2, 4, 1, 3]Output: 3Explanation:The following sub-tree is a BST of size 3Input: root = [6, 7, 3, N, 2, 2, 4]Output: 3Explanation: The following sub-tree is a BST of size 3:

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-24 21:26:47
- **Status:** Correct
- **Marks:** 4

```java
class Quad{
    int max;
    int min;
    int size;
    boolean isBST;
    Quad(int max,int min,int size,boolean isBST){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isBST = isBST;
    }
}
class Solution {
    int maxSize;
    public int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }
    public Quad helper(Node root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst = helper(root.left);
        Quad rst = helper(root.right);
        int max = Math.max(root.data,Math.max(lst.max,rst.max));
        int min = Math.min(root.data,Math.min(lst.min,rst.min));
        int size = 1 + lst.size + rst.size;
        boolean isBST = lst.isBST && rst.isBST && root.data>lst.max && root.data<rst.min;
        if(isBST) maxSize = Math.max(size,maxSize);
        return new Quad(max,min,size,isBST);
    }
}
```

*Generated on: 10/24/2026, 9:27:04 PM*