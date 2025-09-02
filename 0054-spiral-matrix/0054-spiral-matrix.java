class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix[0].length-1;
        int l=0;
        int up=0;

        int d=matrix.length-1;
        int f=0;
        ArrayList<Integer>arr=new ArrayList<>();

        while(l<=r && up<=d){
            if(f==0){
                for(int i=l;i<=r;i++){
                    arr.add(matrix[l][i]);
                }
                up++;
                f=1;
            }
             else if(f==1){
                for(int i=up;i<=d;i++){
                    arr.add(matrix[i][r]);
                }
                r--;
                f=2;
            }
            else if(f==2){
                 for(int i=r;i>=l;i--){
                    arr.add(matrix[d][i]);
                }
                d--;
                f=3;

            }
           else if( f==3){
            for(int i=d;i>=up;i--){
                arr.add(matrix[i][l]);
            }
            l++;
            f=0;
           }



        }
        return arr;
        
    }
}