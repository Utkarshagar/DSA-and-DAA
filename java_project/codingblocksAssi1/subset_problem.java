package java_project.codingblocksAssi1;

import java.util.*;
public class subset_problem {
    public static void main(String args[]) {
        Scanner in_put=new Scanner(System.in);
        int n=in_put.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in_put.nextInt();

        int tar=in_put.nextInt();
        // Your Code Here
        int c=print(arr,tar,0,"",0,0);
        System.out.println();
        System.out.println(c);
    }
    public static int print(int[] arr,int tar,int sum,String ans,int idx,int count){
        if(sum==tar){
            System.out.print(ans+" ");
            count++;
            return count;
        }
        if(sum>tar)
        return count;
        for(int i=idx;i<arr.length;i++){
            count=print(arr,tar,sum+arr[i],ans+arr[i]+" ",i+1,count);

        }
        return count;

    }
}
