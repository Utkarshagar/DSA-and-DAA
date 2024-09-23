package java_project.String;
import java.util.*;

public class string_pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder builder=new StringBuilder();
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+(s.charAt(i));

        }
        System.out.println(str);
        if(s.equals(str)){
            System.out.println("pallindrome");
        }
        else
        System.out.println("not pallindrome");
        
    }
    
}
