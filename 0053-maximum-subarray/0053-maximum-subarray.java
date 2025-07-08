class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max_s=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            max_s=Math.max(max_s,curr);
            if(curr<0){
                curr=0;
            }
            
            
        }
        return max_s;
        
    }
}