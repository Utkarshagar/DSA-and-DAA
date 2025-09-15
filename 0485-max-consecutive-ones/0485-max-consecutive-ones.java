class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
       
         

         int count=0;
         int d=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==1 ){
            count++;
            d=Math.max(d,count);

        }
        else{
            count=0;
        }

       }
       
        return d;
        
    }
}