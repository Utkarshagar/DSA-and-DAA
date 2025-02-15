import java.util.HashSet;

public class Leetcode3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int m=0;
        HashSet<Character>map=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(map.contains(s.charAt(i))){
                map.remove(s.charAt(l));
                l++;
            }
            
                map.add(s.charAt(i));
                m=Math.max(m,i-l+1);

        }
        return m;
        }
        

    }

    
}
