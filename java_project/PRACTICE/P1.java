package java_project.PRACTICE;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        print(N);


    }
    public static void print(int N){
        for(int i=N;i>=1;i--){
            if(i%2!=0){
                System.out.println(i);
            }

        }
        for(int j=2;j<=N;j++){
            if(j%2==0){
                System.out.println(j);
            }
        }
       }
    
    
}
