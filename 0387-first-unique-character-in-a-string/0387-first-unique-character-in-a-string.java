class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        char x='0';
        for(char c:map.keySet()){
            if(map.get(c)==1) {
               return s.indexOf(c);
               


            }
        }
       
        return -1;
        
    }
}