class Solution {
    public int lengthOfLongestSubstring(String s) {
        int m=0;
        int l=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
             
            
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
           
            m=Math.max(m,i-l+1);


        }
        return m;
        
    }
}