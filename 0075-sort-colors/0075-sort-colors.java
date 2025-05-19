class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length-1;
        int l=0,m=0;
        while(m<=n){
            if(nums[m]==0){
                int temp=nums[l];
                nums[l++]=nums[m];
                nums[m++]=temp;


            }
            else if(nums[m]==1) m++;
            else{
                int temp=nums[m];
                nums[m]=nums[n];
                nums[n--]=temp;            
                }
        }
       
        
        
    }
}