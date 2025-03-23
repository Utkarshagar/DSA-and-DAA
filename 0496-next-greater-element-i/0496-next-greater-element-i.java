class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums1.length];
        for( int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int l=j+1;l<nums2.length;l++){
                        if(nums1[i]<nums2[l]){
                            arr[i]=nums2[l];
                            break;
                        }
                    }
                   
                }
            }
            if(arr[i]==0)
            arr[i]=-1;
        }
        return arr;
        
    }
}