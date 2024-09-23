package java_project.PRACTICE;

import java.util.Scanner;

public class codeforceswaste {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int co=0;
        co=print(a,b,1,1,"",co);
        System.out.println();
        System.out.print(co);
        int arr=6;
        
        prr(arr);
        // Your Code Here
    }
    private static void prr(int arr){
        int y;
        
        for(int i=1;i<5;i++){
             y=3+i;
        

        }}
    public static int print(int a,int b,int r,int c,String ans,int co){
        if(r==a && c==b){
            System.out.print(ans+" ");
            co++;
            return co;
            }
            if(r>a || c>b)
            return co;
            co=print(a,b,r+1,c,ans+"V",co);
            co=print(a,b,r,c+1,ans+"H",co);
            //co=print(a,b,r+1,c+1,ans+"D",co);
            return co;
            

    }
    
    
}

private static void prr(int arr){
    int b=3;
    for(int i=1;i<5;i++){
        b=b+i;

    }
}