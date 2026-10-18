## 01. LCA in Binary Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1)

### Problem Description

**Task:** Given the root of a binary tree with all unique values and two nodes value, n1 and n2. Find the lowest common ancestor of the given two nodes. Both node values are always present in the Binary Tree.Note: LCA is the first common ancestor of both the nodes n1 and n2 from bottom of tree.Examples:Input: root = [1, 2, 3, 4, 5, 6, 7], n1 = 4, n2 = 5 Output: 2

#### Examples

##### Example 1

- **Output:**
```text
3
```
- **Explanation:** LCA of 7 and 8 is 3.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-18 22:27:03
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    void path(Node root,int a,int b,ArrayList<Node> arr,ArrayList<Node> arr1,ArrayList<Node> arr2){
        if(root==null) return;
        arr.add(root);
        if(root.data==a){
            arr1.addAll(arr);
        }
        if(root.data==b){
            arr2.addAll(arr);
        }
        path(root.left,a,b,arr,arr1,arr2);
        path(root.right,a,b,arr,arr1,arr2);
        arr.removeLast();
    }
    Node lca(Node root, int a, int b) {
        if(root==null) return null;
        ArrayList<Node> arr1 = new ArrayList<>();
        ArrayList<Node> arr2 = new ArrayList<>();
        ArrayList<Node> arr = new ArrayList<>();
        path(root,a,b,arr,arr1,arr2);
        int n = Math.min(arr1.size(),arr2.size());
        Node ans = null;
        for(int i=0;i<n;i++){
            if(arr1.get(i).data==arr2.get(i).data) ans = arr1.get(i);
            else break;
        }
        return ans;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-18 12:57:38
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    boolean exist(Node root,int n){
        if(root==null) return false;
        if(root.data==n) return true;
        return (exist(root.left,n) || exist(root.right,n));
    }
    Node lca(Node root, int n1, int n2) {
        if(root==null) return root;
        if(root.data==n1 || root.data==n2) return root;
        boolean n1LiesInLeft = exist(root.left,n1);
        boolean n2LiesInRight = exist(root.right,n2);
        if(n1LiesInLeft && !n2LiesInRight) return lca(root.left,n1,n2);
        else if(!n1LiesInLeft && n2LiesInRight) return lca(root.right,n1,n2);
        else return root;
    }
}
```

*Generated on: 10/18/2026, 10:27:10 PM*