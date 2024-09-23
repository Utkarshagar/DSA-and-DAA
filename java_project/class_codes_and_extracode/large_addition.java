package java_project.class_codes_and_extracode;
import java.util.*;

public class large_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String str=sc.next();
            System.out.println(print(str));
        }

        
    }
    public static String print(String str){
        int n=str.length();
        if(n==1) 
        return "No";
        if(str.charAt(0)!='1') return "No";
        if(str.charAt(n-1)=='9') return "No";
        else{
            for(int i=1;i<n;i++){
                if(str.charAt(i)=='0'){
                    return "No";
                }
            }
        }
        return "Yes";





    }
    
}
