package java_project;
import java.util.*;
public class practice {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            

        }
        Arrays.sort(arr);
        int c=0;
        for(int j=0;j<arr.length;j=j+2){
            c=c+arr[j];
        }
        System.out.println(c);


    }
}