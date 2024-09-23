package java_project.function;
import java.util.Scanner;

public class factorial_func {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        factorial(a);
         
        
    
    
    }
    public static void factorial(int a){
        int count=1;
        for(int i=a;i>0;i--){
           count=count*i;
        }
        System.out.println(count);

        
    }
     

    
}
