package java_project;
import java.util.Scanner;

public class check_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        int arr[]=new int[b];
        for(int j=0;j<b;j++){

            arr[j]=sc.nextInt();
        }
        for(int j=0;j<b;j++){
            System.out.println(arr[j]);
        }
        System.out.println();
        Arrays.sort(arr)
        


    }
    }
    
    
}
