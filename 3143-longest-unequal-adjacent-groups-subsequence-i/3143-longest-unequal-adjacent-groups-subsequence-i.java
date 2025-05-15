class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
       
        List<String>l=new ArrayList<>();
         l.add(words[0]);
         int b=groups[0];
         for(int i=1;i<groups.length;i++){
            if(b!=groups[i]){
                l.add(words[i]);
                b=groups[i];
            }
         }
         return l;
        
    }
}