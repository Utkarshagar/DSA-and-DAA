package java_project.practice1;

public class factorial {
    public static void main(String[] args) {
        int n,i;
        print( 1, 5);
        
    }
    public static void print(int n,int i){
        if(i==0){
            System.out.println(n);
            return;
        }
        n=n*i;
        i=i-1;
        print(n,i);
    }
    
}
