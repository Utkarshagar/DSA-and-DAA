package java_project.codingblocksAssi1;
import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=0;j<n-1;j++){
            if(arr[j]==arr[j+1]){
                System.out.print(arr[j]+" ");
            }
        }
    }
    
}
