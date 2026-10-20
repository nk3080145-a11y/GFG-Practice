## 01. Construct Tree from Inorder & Preorder

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/construct-tree-1/1)

### Problem Description

**Task:** Given two arrays representing the inorder and preorder traversals of a binary tree, construct the binary tree and return its root.

> **Note:** The inorder and preorder traversals contain unique values, and every value present in the preorder traversal is also found in the inorder traversal.

#### Examples

##### Example 1

- **Input:**
```text
inorder[] = [3, 1, 4, 0, 5, 2], preorder[] = [0, 1, 3, 4, 2, 5]
```
- **Output:**
```text
[0, 1, 2, 3, 4, 5]
```
- **Explanation:** The tree will look like

##### Example 2

- **Input:**
```text
inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]
```
- **Output:**
```text
[1, 4, 3, 5, N, N, N, 2]Explanation: The tree will look like
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-20 12:13:38
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
    public static Node build(int pLo,int pHi,int iLo,int iHi,int inorder[] , int preorder[]){
        if(iLo>iHi || pLo>pHi) return null;
        int first = preorder[pLo];
        int r = -1;
        for(int i=iLo;i<=iHi;i++){
            if(inorder[i]==first){
                r = i;
                break;
            }
        }
        int count = pLo + r - iLo;
        Node root = new Node(preorder[pLo]);
        root.left = build(pLo+1,count,iLo,r-1,inorder,preorder);
        root.right = build(count+1,pHi,r+1,iHi,inorder,preorder);
        return root;
    }
}
```

*Generated on: 10/20/2026, 12:19:24 PM*