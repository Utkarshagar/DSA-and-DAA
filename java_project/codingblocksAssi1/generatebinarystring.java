package java_project.codingblocksAssi1;

//public class generatebinarystring 
import java.util.*;
public class generatebinarystring  {
    public static void main(String args[]) {
        Scanner in_put=new Scanner(System.in);
        int t=in_put.nextInt();
        while(t-->0){
            String str=in_put.next();
            print(str,"",0);
        }

    }
    public static void print(String st,String ans,int idx){
        if(st.length()==ans.length()){
            System.out.print(ans+" ");
            return;
        }
       // System.out.println(ans);
        for(int i=idx;i<st.length();i++){
            if(st.charAt(i)!='?'){
                ans=ans+st.charAt(i);
                if(ans.length()==st.length()){
                    System.out.print(ans+" ");
                    return;
                }
            }
            else{
                print(st,ans+"0",i+1);
                print(st,ans+"1",i+1);
            }
        }
        return;

    }
}
