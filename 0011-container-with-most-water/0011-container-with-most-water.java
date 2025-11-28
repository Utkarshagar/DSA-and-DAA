class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int a=0;

        while(i<j){
            int m=Math.min(height[i],height[j]);
            int y=j-i;
            a=Math.max(a,m*y);
            if(height[i]<height[j])i++;
            else{
                j--;
            }


        }
        return a;
        
    }
}