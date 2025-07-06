class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subset=1<<nums.length;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<subset;i++){
            ArrayList<Integer>arr1=new ArrayList<>();
            for(int num =0;num<nums.length;num++){
                if((i & (1<<num))!=0){
                    arr1.add(nums[num]);

                }
            }
            arr.add(arr1);

        }
        return arr;

        
    }
}