package java_project.class_codes_and_extracode;
import java.util.*;

public class mergetosorted {
    public static void main(String[] args) {
        int arr[]={1,2,7,9,24};
        int arr1[]={1,2,3,5,5,7};
        int arr2[]=new int[arr.length+arr1.length];
        
       int i=0,j=0,k=0;
       while(i<arr.length && j<arr1.length){
        if(arr[i]<=arr1[j]){
            arr2[k++]=arr[i++];
        }
        else{
            arr2[k++]=arr1[j++];
            
        }
       }
       while(i<arr.length){
        arr2[k++]=arr[i++];
       }
       while(j<arr1.length){
        arr2[k++]=arr1[j++];
       }
       System.out.println(Arrays.toString(arr2));
    }

    
}
