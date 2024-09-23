package java_project.recursion_practice;

public class print_factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(function(n));
    }
    public static int function(int n){
        if(n==1){
            return 1  ;
        }
        //int sp=function(n-1);//fuction call
         n=function(n-1)*n;
        return n;
        
        
       
        
        

    }
    
}
