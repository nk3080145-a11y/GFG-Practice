## 01. BST to Greater Sum Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/bst-to-greater-sum-tree/1)

### Problem Description

**Task:** Given the root of a BST with unique node values, transform it into greater sum tree where each node contains sum of all nodes greater than that node.

#### Examples

##### Example 1

- **Input:**
```text
root = [11, 2, 29, 1, 7, 15, 40, N, N, N, N, N, N, 35, N] Output: [119, 137, 75, 139, 130, 104, 0, N, N, N, N, N, N, 40, N]Explanation: Every node is replaced with the sum of nodes greater than itself.
```

##### Example 2

- **Input:**
```text
root = [2, 1, 6, N, N, 3, 7] Output: [16, 18, 7, N, N, 13, 0]Explanation: Every node is replaced with the sum of nodes greater than itself.
```

#### Constraints

- **1.** `1 ≤ node- > data ≤ 3*10⁴ 1 ≤ number of nodes ≤ 3*10⁴`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 22:27:14
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    static int sum;
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.right);
        int val = root.data;
        root.data = sum;
        sum += val;
        inorder(root.left);
    }
    public void transformTree(Node root) {
        sum = 0;
        inorder(root);
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-23 22:10:59
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public void inorder(Node root,ArrayList<Node> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
    public void transformTree(Node root) {
        ArrayList<Node> ans = new ArrayList<>();
        inorder(root,ans);
        int sum = 0;
        for(int i=ans.size()-1;i>=0;i--){
            int curr = ans.get(i).data;
            ans.get(i).data = sum;
            sum += curr;
        }
    }
}
```

*Generated on: 10/23/2026, 10:27:27 PM*