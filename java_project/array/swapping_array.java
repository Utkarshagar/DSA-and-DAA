package java_project.array;


import java.util.*;

public class swapping_array {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7};
        function(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void function(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    
}
