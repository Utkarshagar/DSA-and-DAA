class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int arr[]:matrix){
            int s=0;

            int e=arr.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==target) return true;
                if(arr[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return false;
        
    }
}