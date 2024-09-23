package java_project.practice1;

public class sum1 {
    public static void main(String[] args) {
        int n,sum,i;
        print(5, 0, 1);
        
    }
    public static void print(int n,int sum,int i){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        print(n, sum, i+1);
        System.out.println(i);
    }
    
}
