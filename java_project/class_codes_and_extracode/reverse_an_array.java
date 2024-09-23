package java_project.emlectures;

import java.util.Arrays;

public class reverse_an_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int e=arr.length-1;
        while(i<e){
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;
            i++;
            e--;
        }
        Arrays.toString(arr);
        
    }
    
}
