package java_project.practice1;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int i=1;
        int n=0;
        System.out.println(print(n,i,a));
        
        
    }
    public static int print(int n,int i,int a){
        if(i==a+1){
            return n;
        }

        n=n+i;
        i++;
        return(print(n, i,a));
        
    }
    
}
