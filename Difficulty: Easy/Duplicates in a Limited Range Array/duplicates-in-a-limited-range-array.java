class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        int i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<arr.length){
            int idx = arr[i]-1;
            if(arr[i]==i+1 || arr[i]==arr[idx]) i++;
            else{
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        return ans;
    }
    public void swap(int[] arr , int i ,int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
} 