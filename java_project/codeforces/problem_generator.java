package java_project.codeforces;
import java.util.*;

public class problem_generator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            String e=sc.next();
            char [] c=s.toCharArray();
            char[] d=e.toCharArray();
            char temp=c[0];

           c[0]=d[0];
           d[0]=temp;
           String swap1=new String (c);
           String swap2=new String(d);
           System.out.print(swap1+" "+swap2);
           System.out.println();



        }
    }
    
}
