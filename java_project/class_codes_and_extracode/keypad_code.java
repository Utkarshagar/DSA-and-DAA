package java_project.class_codes_and_extracode;
import java.util.*;
public class keypad_code {
    static int count =0;
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        per(s,"");
        System.out.println();
        System.out.println(count);
    }
    public static void per(String s,String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            count++;
            return;
        }
        for(int i=0;i<s.length();i++){
            per(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
        }
    }
}
