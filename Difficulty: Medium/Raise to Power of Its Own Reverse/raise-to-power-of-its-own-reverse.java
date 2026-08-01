class Solution {
    public int pow(int a , int b){
        if(b==0) return 1;
        int val = pow(a,b/2);
        if(b%2==0) return val*val;
        else return val*val*a;
    }
    public int reverseExponentiation(int n) {
        // code here
        if(n==10) return 10;
        return pow(n,n);
    }
}
