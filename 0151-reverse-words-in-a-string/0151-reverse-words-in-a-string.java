class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        StringBuilder st=new StringBuilder ();
        for(int i=arr.length-1;i>=0;i--){
            st.append(arr[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}