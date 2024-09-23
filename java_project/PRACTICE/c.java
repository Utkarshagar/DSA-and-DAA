package java_project.PRACTICE;
import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(b<3 && b%3!=0){
            b++;
            c--;

        }
        if(b>3 && b%3!=0){
            b--;
            c++;
            if(c<3){
                System.out.print(-1);
                break;
            }
        }if(c<3 && c!=0){
        System.out.println(a+(b/3)+(c/3)+1);}
        else{
            System.out.println(a+(b/3)+(c/3));
        }
    }



        
    }
    
}
