class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int e=nums.length-1;
        while(i<=e){
            int m=i+(e-i)/2;
            if(nums[m]==target) return m;
            if(target>nums[m]) {
                i=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;

        
    }
}