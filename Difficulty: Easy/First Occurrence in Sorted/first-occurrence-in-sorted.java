class Solution {
    public int helper(int[] arr , int k , int lo , int hi , int idx){
        if(lo>hi) return idx;
        int mid = (lo+hi)/2;
        if(arr[mid]==k){
            idx = mid;
            return helper(arr,k,lo,mid-1,idx);
        }
        else if(arr[mid]<k){
            return helper(arr,k,mid+1,hi,idx);
        }
        else return helper(arr,k,lo,mid-1,idx);
    }
    public int firstSearch(int[] arr, int k) {
        // int lo = 0 , hi = arr.length-1;
        // int lastOcc = -1;
        // while(lo<=hi){
        //     int mid = (lo+hi)/2;
        //     if(arr[mid]<k) lo = mid + 1;
        //     else if(arr[mid]>k) hi = mid - 1;
        //     else if(arr[mid]==k){
        //         lastOcc = mid;
        //         hi = mid - 1;
        //     }
        // }
        // return lastOcc;
        int n = arr.length;
        return helper(arr,k,0,n-1,-1);
    }
}