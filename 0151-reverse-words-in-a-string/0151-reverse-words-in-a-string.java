class Solution {
    public String reverseWords(String s) {
        String ans = "";
        
        String a[]=s.split(" ");
        System.out.print(Arrays.toString(a));
        for(int i=a.length-1;i>=0;i--){
            if(!a[i].trim().equals("")){
                ans+=a[i];
                ans+=" ";
            }
        }
       

        // System.out.print(Arrays.toString(a));
        // String ai="";
        // for(int i=a.length-1;i>0;i--){
        //     ai+=a[i];
        //     ai+=" ";
        // }
        // return ai+a[0];
        return ans.trim();
        
    }
}