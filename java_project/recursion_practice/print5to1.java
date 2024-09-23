package java_project.recursion_practice;
//RECURSION:function that call itself

public class print5to1 {
    public static void main(String[] args) {
        int n=5;
        printnumber(n);
        
        
    }
    public static void printnumber(int n){
        if(n==0){     //BASE CONDITION
            return;
        }
        System.out.println(n);  //PRINT THE VALUE
        printnumber(n-1);   //RECURSIVE CALL OR RECURSION

    }
    
}
