class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int a:nums){
            if(a==0) c++;

        }
        while(c!=0){
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]==0 && nums[i]!=0){
                    int temp=nums[i-1];
                    nums[i-1]=nums[i];
                    nums[i]=temp;
                }
            }
            c--;
        }
    }
}