class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>arr1=new ArrayList<>();
        print(arr,candidates,target,0,arr1);
        return arr;

        
    }
    public static void print(List<List<Integer>>arr,int[] candidates,int target,int i, List<Integer>arr1){
        if (target < 0) return; 
        if(i==candidates.length){
            if(target==0){
                arr.add(new ArrayList<>(arr1));
               
            }
            return;

        }
        arr1.add(candidates[i]);
        print(arr,candidates,target-candidates[i],i,arr1);
        arr1.remove(arr1.size()-1);
       
        print(arr,candidates,target,i+1,arr1);

    }
}