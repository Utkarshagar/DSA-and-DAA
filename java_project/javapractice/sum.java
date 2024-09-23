package java_project.javapractice;

public class sum {
    static int sum=0;
    public static void main(String[] args) {
        int num=123;

        System.out.println(print(num));
        //print(num,sum);
    }
    public static int print(int num){
        if(num==0){
            return 0;
        }
        int rev=num%10;
        sum=sum+rev;
        print(num/10);
        return sum; 

    }
    
}
