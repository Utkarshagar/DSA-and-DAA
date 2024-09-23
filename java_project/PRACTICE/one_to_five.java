package java_project.PRACTICE;

public class one_to_five {
    public static void main(String[] args) {
        int n=1;
        print(1);
        
    }
    public static void print(int n){
        if(n==6){//base condition
            return;
        }
        System.out.println(n);
        print(n+1);//recursion
    }

    
}
