package java_project.PRACTICE;

public class sum_re {
    public static void main(String[] args) {
        int n=5;
        System.out.println(num(n));
    }
    public static int num(int n) {
        if(n==1){
            return 1;
        }
        n=n+num(n-1);
        return n;
        
    }
    
}
