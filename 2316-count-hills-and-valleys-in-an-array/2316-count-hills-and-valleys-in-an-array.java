class Solution {
    public int countHillValley(int[] nums) {
        int p=0;
        int n=0;
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if (nums[i] == nums[i - 1]) continue;
            p=i-1;
            n=i+1;
            while(p>=0 && nums[p]==nums[i]) p--;
            while(n<nums.length && nums[n]==nums[i]) n++;
            if(p>=0 && n<nums.length){

            
            if(nums[p]<nums[i] && nums[n]<nums[i]) c++;
            else if(nums[p]>nums[i] && nums[n]>nums[i]) c++;
            }


        }
        return c;
        
    }
}