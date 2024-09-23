package java_project.recursion_practice;
//import java.util.*;

public class print_sum_n {
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));
        
    }
    public static int print(int n) {
        if(n==1){
            return 1;
        }
        return n+print(n-1);
        
    }

    
}
