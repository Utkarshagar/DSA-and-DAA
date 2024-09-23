package java_project.practice1;

public class x_power {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int i=1;
        print(x,y, i);

        
    }
    public static void print(int x,int y,int i){
        if(y==0){
            System.out.print(i);
            return;
        }
        i=i*x;
        print(x, y-1, i);



    }
    int f(int x,int n){
        if(n==1) return 1;
        int half=f(x, n/2);
        int full=half*half;
        if(n%2==0) return full;
        return x*full;
    }
    
}
