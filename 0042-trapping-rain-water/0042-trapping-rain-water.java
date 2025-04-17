class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int a=0;
        int b=0;
        int ans=0;

        while(i<j){
            a=Math.max(a,height[i]);
            b=Math.max(b,height[j]);
            if(a<b){
                ans+=a-height[i];
                i++;

            }
            else{
                ans+=b-height[j];
                j--;
            }
            
        }
        return ans;
        
    }
}