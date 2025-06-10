class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char d:s.toCharArray()){
            map.put(d,map.getOrDefault(d,0)+1);
        }
        int e=Integer.MAX_VALUE;
        int a=Integer.MIN_VALUE;
        for(char c:map.keySet()){
            if(map.get(c)%2==0){
                e=Math.min(e,map.get(c));
            }
            else{
                a=Math.max(a,map.get(c));
            }
        }
        return a-e;
        
    }
}