class Solution {
    int missingNum(int arr[]) {
        // int n = arr.length;
        // int xor = 0;
        // for(int i=0;i<n;i++){
        //     xor = xor ^ arr[i];
        //     xor = xor ^ (i+1);
        // }
        // return xor ^ (n+1);
        int i = 0;
        int n = arr.length+1;
        while(i<arr.length){
            if(arr[i]==n || arr[i]==i+1) i++;
            else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n;
    }
    public void swap(int[] arr , int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}