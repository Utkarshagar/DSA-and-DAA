class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
         for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int d=0;
        for(char c:map1.keySet()){
            if(map1.get(c).equals(map2.get(c))) d++;
        }
        return d==map1.size() && s.length()==t.length();
        
    }
}