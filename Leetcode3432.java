public class Leetcode3432 {
    class Solution {
        public int countPartitions(int[] nums) {
            int count=0;
            int n=nums.length;
            int x=0;
            int y=0;
            
           for(int a:nums){
            x+=a;
           }
           for(int i=0;i<n-1;i++){
            y+=nums[i];
            int z=x-y;
            if((y-z)%2==0) count++;
    
    
           }
           return count;
            
        }
    }
    
}
