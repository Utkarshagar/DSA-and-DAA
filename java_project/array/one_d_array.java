package java_project.array;
import java.util.*;
public class one_d_array {
    public static void main(String[] args) {
        // all the data type in array should be same 
        int[] arr = new int[5];
        Scanner sc=new Scanner(System.in);
        int t=5;
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
            

        }
            // array declaration
            int c[]={1,2,3,4};
            System.out.println(Arrays.toString(c));



        
    }

    
}
