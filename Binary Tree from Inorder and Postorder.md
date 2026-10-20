## 01. Binary Tree from Inorder and Postorder

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1)

### Problem Description

**Task:** Given two arrays representing the inorder and postorder traversals of a binary tree, your task is to construct the binary tree and return its root.The inorder and postorder traversals contain unique values. Every value present in the postorder traversal is also found in the inorder traversal.Examples:Input: inorder[] = [4, 8, 2, 5, 1, 6, 3, 7], postorder[] = [8, 4, 5, 2, 6, 7, 3, 1]

#### Examples

##### Example 1

- **Output:**
```text
[2, 9, 4, N, 5, 3]
```
- **Explanation:** The resultant binary tree will be:

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-20 14:16:40
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public Node buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public Node build(int pLo,int pHi,int iLo,int iHi,int[] inorder,int[] postorder){
        if(iLo>iHi || pLo>pHi) return null;
        int first = postorder[pHi];
        int r = -1;
        for(int i=iLo;i<=iHi;i++){
            if(inorder[i]==first){
                r = i;
                break;
            }
        }
        int count = r - iLo;
        Node root = new Node(postorder[pHi]);
        root.left = build(pLo,pLo+count-1,iLo,r-1,inorder,postorder);
        root.right = build(count+pLo,pHi-1,r+1,iHi,inorder,postorder);
        return root;
    }
}
```

*Generated on: 10/20/2026, 2:16:57 PM*