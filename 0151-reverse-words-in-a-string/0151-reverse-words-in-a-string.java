class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");// used to remove two or more spaces
        System.out.println(Arrays.toString(arr));
        StringBuilder st=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
           

           
            st.append(arr[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        
        return st.toString();
        
    }
}