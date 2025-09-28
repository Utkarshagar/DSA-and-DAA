class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int l=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            int count=0;
            for(int j=0;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                return st.toString();
            }
            
            }
            
                st.append(strs[0].charAt(i));
                
            
        }
        return st.toString();
        
    }
}