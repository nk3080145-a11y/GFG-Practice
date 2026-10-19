## 01. Paths from Root with Sum

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1)

### Problem Description

**Task:** Given a binary tree and an integer s, print all paths starting from the root such that the sum of the node values along each path equals s.
A path does not necessarily have to end at a leaf node.

#### Examples

##### Example 1

- **Input:**
```text
s = 8, root[] = [1, 20, 3, N, N, 4, 15, 6, N, N, N, N, N] Output : [[1, 3, 4]]
```
- **Explanation:** Sum of path 1, 3, 4 = 8.

##### Example 2

- **Input:**
```text
s = 38, root[] = [10, 28, 13, N, N, 14, 15, 21, 22, 23, 24, N, N, N, N, N, N, N, N]
```
- **Output:**
```text
[[10, 28], [10, 13, 15]]
```
- **Explanation:** Sum of path 10, 28 = 38 and Sum of path 10, 13, 15 = 38.

#### Constraints

- **1.** `1 ≤ n ≤ 2*10³, where n is the number of nodes in the binary tree -10³ ≤ s ≤ 10³ -10³ ≤ Node.value ≤ 10³`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n^2)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-19 13:34:04
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public void path(Node root,int sum,ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> arr,int total){
        if(root==null) return;
        arr.add(root.data);
        total += root.data;
        if(total==sum){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(arr);
            ans.add(temp);
        }
        path(root.left,sum,ans,arr,total);
        path(root.right,sum,ans,arr,total);
        arr.removeLast();
        total -= root.data;
    }
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        path(root,sum,ans,arr,0);
        return ans;
    }
}
```

*Generated on: 10/19/2026, 1:36:31 PM*