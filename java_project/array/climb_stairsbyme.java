package java_project.array;
import java.util.*;

public class climb_stairsbyme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        
        System.out.println(print(num));


        
    }
    public static int print(int num){
        if(num<=3){
            return num;
        }
        int a=3,b=2;
        for(int i=0;i<num-3;i++){
            a=a+b;
            b=a-b;
        }
        return a;


    }
    
}
