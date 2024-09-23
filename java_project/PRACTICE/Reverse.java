package java_project.PRACTICE;

public class Reverse {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(print(n));

    }
    public static int print(int n) {
        if(n==n%10){
            return n;
        }
        print(n=n/10);
        return n%10;
        
        
    }
    
}
