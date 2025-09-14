class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int count=0;
        ArrayList<Integer>arr=new ArrayList<>();
       

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                arr.add(nums[i-1]);
                count++;
            }

        }
        count++;
        arr.add(nums[nums.length-1]);
        if(arr.size()>1){

        for(int i=0;i<count;i++){
            nums[i]=arr.get(i);
        }
        }
        return count;
        
    }
}