package java_project.practice1;

public class sum_variable {
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n==0){
            return 0;

        }
        int sum=n+print(n-1);
        return sum;
    }
    
}
