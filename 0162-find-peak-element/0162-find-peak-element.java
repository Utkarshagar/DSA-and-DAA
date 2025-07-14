class Solution {
    public int findPeakElement(int[] arr) {
       
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) return i;
        }
        if(arr.length>=2){
        if((arr[arr.length-2]<arr[arr.length-1])  ) return arr.length-1;
        }
        return 0;
        
    }
}