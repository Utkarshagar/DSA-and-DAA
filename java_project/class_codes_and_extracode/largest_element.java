package java_project.class_codes_and_extracode;
import java.util.*;

public class largest_element {
    public static void main(String[] args) {
        int arr[]={-2,6,1,-6,9,6};
        // Arrays.sort(arr);
        // System.out.print(arr[arr.length-1]);
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            
        }
        System.out.println(ans);
    }
    
}
