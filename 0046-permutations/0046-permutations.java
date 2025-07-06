class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>arr=new ArrayList<>();
        boolean []b=new boolean[nums.length];
        List<Integer>l=new ArrayList<>();
        print(arr,b,l,nums);
        return arr;
        
    }
    public static void print(List<List<Integer>>arr,boolean []b,List<Integer>l,int[]nums){
        if(l.size()==nums.length){
            arr.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++)
        if(!b[i]){
            
            
            l.add(nums[i]);
            b[i]=true;
            print(arr,b,l,nums);
            l.remove(l.size()-1);
            b[i]=false;
        }

    }
}