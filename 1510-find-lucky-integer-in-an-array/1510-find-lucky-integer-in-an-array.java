class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=-1;
        for(int b:map.keySet()){
            if(map.get(b)==b){
                count=Math.max(count,b);

            }
        }
        return count;
    }
}