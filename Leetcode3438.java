import java.util.LinkedHashMap;

public class Leetcode3438 {
    class Solution {
    public String findValidPair(String s) {
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        String m="";
       for(int i=1;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)-'0'==map.get(s.charAt(i)) && s.charAt(i-1)-'0'==map.get(s.charAt(i-1)) ){
            m+=s.substring(i-1,i+1);
            return m;

        }
       }
        return "";
    }
}
}
