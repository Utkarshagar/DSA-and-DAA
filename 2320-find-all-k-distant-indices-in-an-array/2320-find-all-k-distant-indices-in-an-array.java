class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                arr1.add(i);
            }
        }
        System.out.println(arr1);
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<arr1.size();j++){
               if(Math.abs(i-arr1.get(j))<=k){
                arr.add(i);
                break;
               }
                
            }
            
        }
        return arr;
        
    }
}