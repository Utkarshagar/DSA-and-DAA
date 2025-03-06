class Solution {
    public void sortColors(int[] arr) {
        int z=0;
        int o=0;
        int t=0;
       for(int n:arr){
        if(n==0){
            z++;
        }
        if(n==1){
            o++;
        }
        if(n==2){
            t++;
        }
       }
       for(int i=0;i<arr.length;i++){
        if(i<z){
            arr[i]=0;
        }
        if(i>=z && i<o+z) arr[i]=1;
        if(i>=o+z && i<z+o+t) arr[i]=2;
      
       }
        
    }
}