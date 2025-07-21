class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        String b="";
       for(int i=a.length-1;i>=0;i--){
        if(!a[i].trim().equals("")){
            b+=a[i];
            b+=" ";
        }

       }
        return b.trim();
        
    }
}