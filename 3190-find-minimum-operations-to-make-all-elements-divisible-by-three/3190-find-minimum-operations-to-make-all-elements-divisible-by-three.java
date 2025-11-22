class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%3!=0){
                if(i<3){
                    i=i+1;
                    c++;
                    
                }
                else{
                    i=i-1;
                    c++;
                }
            }
            

        }
        return c;
    }
}