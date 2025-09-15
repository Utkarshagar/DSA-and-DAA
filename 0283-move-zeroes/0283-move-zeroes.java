class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(j<nums.length){
            if(nums[j]!=0){//at that point not equal to 0
                int temp=nums[i];//and swap where is equal to zero
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;

        }
    }
}