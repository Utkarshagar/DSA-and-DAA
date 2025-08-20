class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        int i=0;
        while(i<n){
            int temp=nums[i];
            nums[i]=nums[n];
            nums[n]=temp;
            i++;
            n--;
        }
        int a=0;
        int l=k%nums.length-1;
        int z=l+1;
        int y=nums.length-1;
        while(a<l){
            int temp=nums[a];
            nums[a]=nums[l];
            nums[l]=temp;
            a++;
            l--;
        }
        while(z<y){
            int temp=nums[z];
            nums[z]=nums[y];
            nums[y]=temp;
            z++;
            y--;
        }
    }
}