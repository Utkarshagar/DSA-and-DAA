class Solution {
    public void moveZeroes(int[] arr) {
        int c=0;
        for(int a:arr){
            if(a==0) c++;
        }
        while(c!=0){
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=0 && arr[i-1]==0){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                    
                }
            }
            c--;
        }

        
    }
}