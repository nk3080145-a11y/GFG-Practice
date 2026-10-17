## 01. Right View of Binary Tree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/right-view-of-binary-tree/1)

### Problem Description

**Task:** Given the root of a binary Tree. Return the right view of the binary tree. The right view of a Binary Tree is the set of nodes visible when the tree is viewed from the right side.Examples :Input: root = [1, 2, 3, N, N, 4, 5]

#### Examples

##### Example 1

- **Output:**
```text
[1, 3, 5]
```

##### Example 2

- **Input:**
```text
root = [1, 2, 3, 4, N, N, N, N, 5]
```
- **Output:**
```text
[3]
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-17 20:55:12
- **Status:** Correct
- **Marks:** 2

```java
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q = new LinkedList<>();
        int count = 0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair first = q.remove();
            if(count==first.level){
                ans.add(first.node.data);
                count++;
            }
            if(first.node.right!=null) q.add(new Pair(first.node.right,first.level+1));
            if(first.node.left!=null) q.add(new Pair(first.node.left,first.level+1));
        }
        return ans;
    }
}
```

*Generated on: 10/17/2026, 9:06:11 PM*