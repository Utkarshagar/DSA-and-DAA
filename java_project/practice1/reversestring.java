package java_project.practice1;
import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=str.length()-1;
        String s="";
        print(str,s,i);

    }
    public static void print(String str, String s,int i){
        if(i==-1){
            //s=s+str.charAt(i);

            System.out.println(s);
            return;
        }
        s=s+str.charAt(i);
        //System.out.println(str.charAt(i));
        //System.out.println(s);
        print(str,s,i-1);

    }
    
}
