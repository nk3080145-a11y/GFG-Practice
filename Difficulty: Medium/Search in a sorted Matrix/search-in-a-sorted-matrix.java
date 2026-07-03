class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return false;
        int totalcol = arr[0].length;
        int totalrow = arr.length;
        int lo = 0 , hi = (totalcol * totalrow) - 1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            int row = mid / totalcol;
            int col = mid % totalcol;
            if(arr[row][col]==x) return true;
            else if(arr[row][col]<x) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}
