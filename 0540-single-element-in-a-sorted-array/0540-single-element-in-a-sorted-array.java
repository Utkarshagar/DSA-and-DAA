class Solution {
    public int singleNonDuplicate(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet()){
            if(map.get(a)==1) return a;
        }
        return 0;
        
    }
}