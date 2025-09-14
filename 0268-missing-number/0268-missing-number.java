class Solution {
    public int missingNumber(int[] nums) {
        int sum=((nums.length)*(nums.length+1))/2;
        int sum1=0;
        
        for(int a:nums){
            sum1+=a;

        }
        return sum-sum1;


        
    }
}