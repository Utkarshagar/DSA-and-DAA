class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int r=0;
        int m=0;
        for(int x:map.keySet()){
            if(map.get(x)>r){
                 r=map.get(x);
                 m=x;

            }
           

        }
        return m ;
        
    }
}