package java_project.javapractice;


public class factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(print(n));
    }
    public static int print(int n) {
        if(n==1){
            return n;
        }
        return n*print(n-1);
        
    }
    
}
