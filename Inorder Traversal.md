## 01. Inorder Traversal

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/inorder-traversal/1)

### Problem Description

**Task:** Given a root of a Binary Tree, your task is to return its Inorder Traversal.

> **Note:** An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).

#### Examples

##### Example 1

- **Input:**
```text
root = [1, 2, 3, 4, 5]
```
- **Output:**
```text
[4, 2, 5, 1, 3]Explanation: The inorder traversal of the given binary tree is [4, 2, 5, 1, 3].
```

##### Example 2

- **Input:**
```text
root = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
```
- **Output:**
```text
[1, 7, 10, 8, 6, 10, 5, 6]Explanation: The inorder traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-10-25 21:05:07
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node p = curr.left;
                while(p.right!=null && p.right!=curr)
                    p = p.right;
                if(p.right==null){
                    p.right = curr;
                    curr = curr.left;
                }
                else{
                    p.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-19 21:29:42
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(st.size()!=0 || curr!=null){
            if(curr!=null){
                if(curr.left!=null){
                    st.push(curr);
                    curr = curr.left;
                }
                else{
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }
        return ans;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-10-13 21:39:21
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public void helper(Node root , ArrayList<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
}
```

*Generated on: 10/25/2026, 9:05:23 PM*