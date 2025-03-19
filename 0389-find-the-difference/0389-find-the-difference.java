class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char m:t.toCharArray()){
            if(!map.containsKey(m)|| map.get(m)==0){
                return m;
            }
            map.put(m,map.get(m)-1);
        }
        return ' ';
        
    }
}