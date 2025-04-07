class Solution {
    public String mergeAlternately(String word1, String word2) {
        int b=Math.max(word1.length(),word2.length());
        int c=Math.min(word1.length(),word2.length());
        String a="";

        for(int i=0;i<c;i++ ){
            a+=word1.charAt(i);
            a+=word2.charAt(i);

        }
        if(c<b){
            for(int i=c;i<b;i++){
                if(word1.length()==b){
                     a+=word1.charAt(i);

                }
                 if(word2.length()==b){
                     a+=word2.charAt(i);

                }


            }
        }
        return a;
        
    }
}