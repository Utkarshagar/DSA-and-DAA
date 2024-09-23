package java_project.practice1;

public class fabonacci_recurssion {
    public static void main(String[] args) {
        int n=10,a,b,c;
        print(n,0,1,0);
    }
    public static void print(int n,int a,int b,int c){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
        print(n-1, a, b, c);
        

    }
    
}
