class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int b=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i])
                b=Math.max(b,nums[j]-nums[i]);
            }
        }
        return b;
        
    }
}