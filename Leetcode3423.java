public class Leetcode3423 {
    class Solution {
        public int maxAdjacentDistance(int[] nums) {
            int m=0;
            int x=0;
            for(int i=0;i<nums.length;i++){
                if(i==nums.length-1){
                    x=Math.abs(nums[i]-nums[0]);
                    m=Math.max(m,x);
                }
                else{
                    x=Math.abs(nums[i]-nums[i+1]);
                    m=Math.max(m,x);
    
                }
            }
            return m;
            
        }
    }

    
}
