class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean f=true;
        while(f==true){
            f=false;
        
       for(int i=0;i<nums.length;i++){
        if(nums[i]==original){
            original=nums[i]*2;
            f=true;
            break;
        }
       }
        }
        return original;

        
    }
}