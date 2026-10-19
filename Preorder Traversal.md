## 01. Preorder Traversal

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/preorder-traversal/1)

### Problem Description

**Task:** Given the root of a binary tree, return its preorder traversal. A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).

#### Examples

##### Example 1

- **Input:**
```text
root = [1, 4, N, 4, 2]
```
- **Output:**
```text
[1, 4, 4, 2]Explanation: The preorder traversal of the given binary tree is [1, 4, 4, 2]
```

##### Example 2

- **Input:**
```text
root = [6, 3, 2, N, 1, 2, N]
```
- **Output:**
```text
[6, 3, 1, 2, 2] Explanation: The preorder traversal of the given binary tree is [6, 3, 1, 2, 2]
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-19 21:21:42
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()!=0){
            Node temp = st.pop();
            ans.add(temp.data);
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        return ans;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-13 21:28:12
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public void helper(Node root , ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.data);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
}
```

*Generated on: 10/19/2026, 9:21:40 PM*