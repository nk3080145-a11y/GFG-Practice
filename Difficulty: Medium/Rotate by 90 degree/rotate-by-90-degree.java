class Solution {
    public void rotateMatrix(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            int j = 0 , k = arr.length-1;
            while(j<k){
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
                j++;
                k--;
            }
        }
    }
}