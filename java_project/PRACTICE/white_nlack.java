package java_project.PRACTICE;
import java.util.*;

public class white_nlack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            int b=sc.nextInt();
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                
                
                if(s.charAt(j)=='B'){
                    count++;

                }
                


            }
            System.out.println(count);
            
        }
        
    }
    
}
