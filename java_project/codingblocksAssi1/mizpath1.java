package java_project.codingblocksAssi1;

import java.util.*;
public class mizpath1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        count=print(n,m,1,1,"",count);
        System.out.println();
        System.out.print(count);
        // Your Code Here
    }
    public static int print(int n,int m,int r,int c,String ans,int count){
        if(r==n && c==m){
            System.out.print(ans+" ");
            count++;
            return count;
            }
            if(r>n || c>m)
            return count;
            count=print(n,m,r+1,c,ans+"V",count);
            count=print(n,m,r,c+1,ans+"H",count);
            count=print(n,m,r+1,c+1,ans+"D",count);
            return count;

    }
}