## 01. Array to BST

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/array-to-bst4443/1)

### Problem Description

**Task:** Given a sorted array arr[]. Convert it into a Height Balanced Binary Search Tree (BST) and return the root of the BST.Height-balanced BST means a binary tree in which the depth of the left subtree and the right subtree of every node never differ by more than 1.Note: You can return any BST, the driver code will check the BST, and print true if it is a Height-balanced BST else print false.Examples :Input: arr[] = [10, 20, 30]

#### Examples

##### Example 1

- **Output:**
```text
true
```
- **Explanation:** One of the possible Height Balanced BST will be [9, 1, 23, N, 5, 14, 27]

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 22:57:25
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public Node build(int[] arr ,int lo ,int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        Node root = new Node(arr[mid]);
        root.left = build(arr,lo,mid-1);
        root.right = build(arr,mid+1,hi);
        return root;
    }
    public Node sortedArrayToBST(int[] arr) {
        return build(arr,0,arr.length-1);
    }
}
```

*Generated on: 10/23/2026, 10:57:41 PM*