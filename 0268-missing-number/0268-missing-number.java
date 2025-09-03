class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        for(int a:nums){
            sum1+=a;

        }
        return sum-sum1;


        
    }
}