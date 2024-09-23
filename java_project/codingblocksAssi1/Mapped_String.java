package java_project.codingblocksAssi1;

//public class Mapped_String
import java.util.*;
public class Mapped_String {
    public static void printmappedstring(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String digit=str.substring(0,i+1);
            int no=Integer.parseInt(digit);
            if(no>25)break;
            char mappedch=(char)(no+64);
            printmappedstring(str.substring(i+1),ans+mappedch);
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printmappedstring(str,"");
    }
}
