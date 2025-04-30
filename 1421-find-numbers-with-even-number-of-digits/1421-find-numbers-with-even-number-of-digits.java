class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int a:nums){
            String k=Integer.toString(a);
            if(k.length()%2==0) c++;

        }
        return c;
        
    }
}