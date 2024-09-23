package java_project.codingblocksAssi1;

import java.util.*;
public class Boardpath {
    static int c=0;
    //public is introduce
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        // taking input
        int num =scanner.nextInt();
        print(t,num,"");
        System.out.println();
        System.out.println(c);
        int arr=6;
        prr(arr);
    }
    //public void is introduce
    private static void prr(int arr){
        int b=3;
        for(int j=1;j<5;j++){
            b=b+j;
    
        }}
    public static void print(int t, int num,String ans){
        if (t==0){
            System.out.print(ans+" ");
            c++;
            return;
        }
        // if is introduce
        if(t<0){
            return;
        }
        // for is introduce
        for(int i=1;i<=num;i++){
            print(t-i,num,ans+i+"");
        }
    }
}