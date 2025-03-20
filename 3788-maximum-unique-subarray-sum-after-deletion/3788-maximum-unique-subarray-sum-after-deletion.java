class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        Arrays.sort(nums);
        if(nums[nums.length-1]<0) return nums[nums.length-1];
        int sum=0;
        for(int a:nums){
            if(a>0){
                s.add(a);
            }

        }
        for(int x:s){
            sum+=x;
        }
        return sum;
        
    }
}