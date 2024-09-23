package java_project.codingblocksAssi1;

//public class Replacehipart1 
import java.util.*;
public class Replacehipart1 {
    public static int cnt=0;
    public static void countremove(String s,String ans,int idx,String replaced){
        if(idx>=s.length()){
            System.out.println(cnt);
            System.out.println(ans);
            System.out.println(replaced);
            return;
        }
        if(idx<s.length()-1&&s.charAt(idx)=='h'&&s.charAt(idx+1)=='i'){
            cnt++;
            countremove(s,ans,idx+2,replaced+"bye");
        }
        else{
            countremove(s,ans+s.charAt(idx),idx+1,replaced+s.charAt(idx));
        }

    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        countremove(s,"",0,"");
    }
}

