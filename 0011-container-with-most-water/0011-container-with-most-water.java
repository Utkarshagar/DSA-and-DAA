class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int a=0;
        while(i<j){
            int y=Math.min(height[i],height[j]);
            a=Math.max(a,y*(j-i));
            if(height[i]<height[j])
            i++;
            else
            j--;

        }
        return a;
        
    }
}