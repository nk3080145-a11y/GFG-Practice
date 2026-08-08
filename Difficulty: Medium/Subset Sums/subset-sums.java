class Solution {
    public void helper(int[] arr , int idx , int sum , ArrayList<Integer> ans){
        if(idx == arr.length){
            ans.add(sum);
            return;
        }
        int val = arr[idx];
        helper(arr,idx+1,sum+val,ans);
        helper(arr,idx+1,sum,ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr,0,0,ans);
        Collections.sort(ans);
        return ans;
    }
}