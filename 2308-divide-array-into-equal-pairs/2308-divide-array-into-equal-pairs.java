class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0;
        for(int x:map.keySet()){
            int m=map.get(x)/2;
            count+=m;

            
        }
        return count==nums.length/2;
        
    }
}