## 01. Flatten Binary Tree to Linked List

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1)

### Problem Description

**Task:** Given a binary tree, flatten the tree into a Linked list:The linked list should use the same Node class where the right child pointer points to the next node in the list and the left child pointer is always null.The linked list nodes should be in the same order as a preorder traversal of the binary tree.Examples:Input: root[] = [1, 2, 5, 3, 4, 6]

#### Examples

##### Example 1

- **Output:**
```text
[1, 3, 4, 2, 5]
```
- **Explanation:** After flattening, the tree looks like: 1 \ 3 \ 4 \ 2 \ 5 Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 3 4 2 5.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (4)

#### Solution 1 (Java)

- **Submitted:** 2026-10-25 21:39:33
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static void flatten(Node root) {
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-25 21:39:16
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static void flatten(Node root) {
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
            else curr = curr.right;
        }
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-10-19 11:34:54
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static void flatten(Node root) {
        if(root==null) return;
        Node lst = root.left;
        Node rst = root.right;
        root.left = null; root.right = null;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        Node temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        temp.right = rst;
    }
}
```

#### Solution 4 (Java)

- **Submitted:** 2026-10-19 11:29:26
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public static void dfs(Node root,ArrayList<Node> ans){
        if(root==null) return;
        ans.add(root);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
    public static void flatten(Node root) {
        if(root==null) return;
        ArrayList<Node> ans = new ArrayList<>();
        dfs(root,ans);
        int n = ans.size();
        for(int i=0;i<n-1;i++){
            Node temp = ans.get(i);
            temp.right = ans.get(i+1);
            temp.left = null;
        }
        ans.get(n-1).right = null;
        ans.get(n-1).left = null;
    }
}
```

*Generated on: 10/25/2026, 9:40:01 PM*