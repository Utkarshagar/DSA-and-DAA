package java_project.PRACTICE;

public class sum_of_digits {
    public static void main(String[] args) {
        int n=123;
        System.out.println(print(n));
   
        
    }
   
    

public static int  print(int n){
    if(n<=0){
        return 0;
    }
    n=(n%10)+print(n/10);
    
    return n;

}
}

