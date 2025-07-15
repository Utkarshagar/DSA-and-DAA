class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int sum=a;
        k=k-1;
        while(k-->0){
            a=a+1;
            sum+=a;


        }
        return sum;
        
    }
}