package java_project.array;

import java.util.Arrays;

public class function {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void change(int arr[]){
        arr[0]=99;
    }
    
}
