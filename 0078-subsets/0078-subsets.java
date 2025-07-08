class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>arr1=new ArrayList<>();
        print(arr,nums,arr1,0);
        return arr;

        
    }
    public static void print(List<List<Integer>>arr,int[]nums,List<Integer>arr1,int i){
        if(i>=nums.length){
            arr.add(new ArrayList<>(arr1));
            return;

        }
        arr1.add(nums[i]);
        print(arr,nums,arr1,i+1);
        arr1.remove(arr1.size()-1);
        print(arr,nums,arr1,i+1);
    }
}