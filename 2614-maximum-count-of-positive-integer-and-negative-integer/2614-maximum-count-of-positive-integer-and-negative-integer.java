class Solution {
    public int maximumCount(int[] nums) {
        int count1=0;
        int count2=0;
        for(int a:nums){
            if(a<0){
                count1++;
            }
            if(a>0){
                count2++;
            }
        }
        return Math.max(count1,count2);
        

    }
}