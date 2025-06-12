class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int a=0;
        for(int i=1;i<nums.length;i++){
            int b=Math.abs(nums[i]-nums[i-1]);
            a=Math.max(a,b);

        }
        int x=Math.abs(nums[nums.length-1]-nums[0]);
        a=Math.max(a,x);
        return a;
        
    }
}