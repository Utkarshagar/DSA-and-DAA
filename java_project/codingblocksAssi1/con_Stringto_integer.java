package java_project.codingblocksAssi1;

// public class 
//public class con_Stringto_integer 
import java.util.*;
public class con_Stringto_integer  {
    public static int integermebadlo(String s,int idx){
        if(idx<0){
            return 0;
        }
        int ele=s.charAt(idx)-'0';
        int i=integermebadlo(s,idx-1);
        i=i*10+ele;
        return i;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String meristring=sc.next();
        int ans=integermebadlo(meristring,meristring.length()-1);
        System.out.print(ans);
    }
}