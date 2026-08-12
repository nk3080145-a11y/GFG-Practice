class Solution {
    int floorSqrt(int x) {
        // code here
        int lo = 1 , hi = x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid == x/mid) return mid;
            else if(mid > x/mid) hi = mid -1;
            else lo = mid + 1;
        }
        return hi;
    }
}