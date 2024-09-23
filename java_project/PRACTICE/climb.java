package java_project.PRACTICE;

public class climb {
    public static void main(String[] args) {
        int n=5 ;
        System.out.println(print(n));
        
    }
    public static int print(int n){
        if(n<=3){
            return n;
        }
        int a=1;
        int b=2;
        for(int i=0;i<n-3;i++){
            a=a+b;
            b=b-a;
        }
        return a;
    }
    
    
}
 
