class Solution {
    public int countPairs(int[] nums, int k) {
        int a=0;
        int b=nums.length-1;
        int count=0;
        for(int i=0;i<=b-1;i++){
            for(int j=i+1;j<=b;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    count++;
                }


            }
        }
        return count;
        
        
    }
}