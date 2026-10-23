## 01. k-th Smallest in BST

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1)

### Problem Description

**Task:** Given the root of a BST and an integer k, find the kth smallest element in the BST. If there is no kth smallest element present then return -1.Examples:Input: root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3 Output: 10

#### Examples

##### Example 1

- **Explanation:** 10 is the 3rd smallest element in the BST.

##### Example 2

- **Input:**
```text
root = [2, 1, 3], k = 5
```
- **Output:**
```text
-1
```
- **Explanation:** There is no 5th smallest element in the BST as the size of BST is 3.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 12:27:11
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public void inorder(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public int kthSmallest(Node root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        if(ans.size()<k) return -1;
        return ans.get(k-1);
    }
}
```

*Generated on: 10/23/2026, 12:27:27 PM*