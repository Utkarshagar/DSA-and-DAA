class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int v=0;
        for(int x:map.keySet()){
            if(map.get(x)==1){
                arr[v]=x;
                v++;
            }
        }
        return arr;

        
    }
}