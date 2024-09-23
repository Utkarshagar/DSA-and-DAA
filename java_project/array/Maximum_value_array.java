package java_project.array;
import java.util.*;

public class Maximum_value_array {
    public static void main(String[] args) {
        int arr[]={1,2,23,4,5};
        func(arr );

        
    }
    public static void func(int arr[]){
        int max_value=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        System.out.println(max_value);
        
    }
    
}
