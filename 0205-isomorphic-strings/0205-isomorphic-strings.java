class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(map1.containsKey(c)&& map1.get(c)!=d || !map1.containsKey(c)&& map1.containsValue(d)) return false;
            map1.put(c,d);
        }
     
        
        return true;

    }
}