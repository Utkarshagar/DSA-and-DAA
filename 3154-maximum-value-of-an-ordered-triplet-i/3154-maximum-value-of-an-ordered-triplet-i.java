class Solution {
    public long maximumTripletValue(int[] nums) {
        long a=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    a=Math.max(a,(long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }
       
        return Math.max(a,0);
    }
}