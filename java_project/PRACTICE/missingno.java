package java_project.PRACTICE;
import java.util.*;

public class missingno {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=5;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
               
            }
            
        }
        System.out.println(n);
    }
    
}
