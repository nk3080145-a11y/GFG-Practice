class Solution {
    public String countAndSay(int n) {
        if(n==1){
            String ans = "1";
            return ans;
        }
        String s = countAndSay(n-1);
        String ans = "";
        int i=0,j=0;
        while(i<s.length()){
            if(j==s.length() || s.charAt(i)!=s.charAt(j)){
                ans = ans + (j-i);
                ans = ans + s.charAt(i);
                i = j;
            }
            else if(s.charAt(i)==s.charAt(j)) j++;
        }
        return ans;
    }
}
