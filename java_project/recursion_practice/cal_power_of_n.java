package java_project.recursion_practice;

public class cal_power_of_n {
    public static void main(String[] args) {
        int a=3;
        int b=11;
        System.out.println(print (a,b));
    }
    public static int print(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        int ans=print(a,b/2);
        if(b%2==0){
            return ans*ans;
        }
       else 
        return a*ans*ans;
    }
    
}
