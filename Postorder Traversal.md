## 01. Postorder Traversal

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/postorder-traversal/1)

### Problem Description

**Task:** Given the root of a Binary Tree, return its Postorder Traversal.

> **Note:** A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.

#### Examples

##### Example 1

- **Input:**
```text
root = [19, 10, 8, 11, 13]
```
- **Output:**
```text
[11, 13, 10, 8, 19]Explanation: The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].
```

##### Example 2

- **Input:**
```text
root = [11, 15, N, 7]
```
- **Output:**
```text
[7, 15, 11]Explanation: The postorder traversal of the given binary tree is [7, 15, 11].
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-19 21:24:05
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()!=0){
            Node temp = st.pop();
            ans.add(temp.data);
            if(temp.left!=null) st.push(temp.left);
            if(temp.right!=null) st.push(temp.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-13 21:44:11
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public void helper(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
}
```

*Generated on: 10/19/2026, 9:24:00 PM*