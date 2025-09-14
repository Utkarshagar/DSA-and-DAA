class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int arr[]:matrix)
        System.out.print(Arrays.toString(arr));
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int j=matrix[0].length-1;
            while(l<j){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][j];
                matrix[i][j]=temp;
                l++;
                j--;
            }
        }
        

        
    }
}