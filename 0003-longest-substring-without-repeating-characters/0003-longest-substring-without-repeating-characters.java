class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int m=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    m=Math.max(m,set.size());

                }
                else{
                    m=Math.max(m,set.size());
                    break;

                }
            }
        }
        return m;
        
    }
}