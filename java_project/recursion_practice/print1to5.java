package java_project.recursion_practice;

public class print1to5 {
    public static void main(String[] args) {
        int n=1;
        function(n);
    }
    public static void function(int n){
        if(n==6){
            return;//base condition
        }
        System.out.println(n);//print
        function(n+1);//recurstion value by1

    } 
    
}
