package java_project.PRACTICE;

import java.util.Scanner;

public class evenodd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int [a];
        int start=1;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        } 
        // 

    }
    
}
