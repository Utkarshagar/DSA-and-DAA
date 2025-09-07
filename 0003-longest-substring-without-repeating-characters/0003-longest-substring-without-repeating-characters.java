class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        
        int a=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    a=Math.max(a,j-i);
                    break;

                }
                set.add(s.charAt(j));
                if(j==s.length()-1)
                a=Math.max(a,j-i+1);

            }
        }
        return a;
    }
}