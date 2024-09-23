package java_project.codingblocksAssi1;

//public class mazepath
import java.util.*;
public class mazepath {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        //int r=0;
       // int c=0;
        String str="";

        print(0,0,arr,"");
        System.out.println();
        System.out.print(count);

        // Your Code Here
    }
    public static void print(int r,int c,int arr[][],String str){

        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.print(str+" ");
            count++;
            return;
        }
        if(r<=arr.length-1){
            print(r+1,c,arr,str+"V");
        }
        if(c<=arr.length-1){
            print(r,c+1,arr,str+"H");
        }

    }
}

