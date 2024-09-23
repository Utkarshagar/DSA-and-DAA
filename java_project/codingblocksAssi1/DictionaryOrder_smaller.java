package java_project.codingblocksAssi1;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrder_smaller {
    public static void main(String args[]) {
        Scanner in_put=new Scanner(System.in);
        String st=in_put.next();
        char[] temp=st.toCharArray();
        boolean[] arr=new boolean[st.length()];
        Arrays.sort(temp);
       String s=new String(temp);
        ways(s,"",arr,st);
        // Your Code Here
    }
    public static void ways(String s,String ans,boolean[] arr,String st){
         if(ans.length()==s.length()){
             if(st.compareTo(ans)>0)
                System.out.println(ans);
                return;

        }

        for(int i=0;i<s.length();i++){
        
            if(arr[i]==false){
                arr[i]=true;
            ways(s,ans+s.charAt(i),arr,st);
            arr[i]=false;
            }
        }
        return;

    }
}
    

