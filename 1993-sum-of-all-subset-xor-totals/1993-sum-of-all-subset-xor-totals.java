class Solution {
    public int subsetXORSum(int[] nums) {
        int total=0;
        for(int a:nums){
            total|=a;
        }
        return total*(1<<(nums.length-1));

        
    }
}