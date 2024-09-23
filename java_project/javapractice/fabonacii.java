package java_project.javapractice;

public class fabonacii {
    public static void main(String[] args) {
        int n=8;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        print(a,b,n-2);
    }
    public static void print (int a,int b,int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        print(b, c, n-1);
        
    }
    
}
