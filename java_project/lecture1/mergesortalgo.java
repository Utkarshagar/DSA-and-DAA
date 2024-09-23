package java_project.lecture1;

import java.util.Arrays;

public class mergesortalgo extends mergesort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,8,9};
        mergsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergsort(int[]arr,int st,int ed) {
        if(st==ed){
            return;
        }
        int mid=(st+ed)/2;
        mergsort(arr,st,mid);
        mergsort(arr, mid+1, ed);
        mergsort(arr, st, mid,ed);
        
    }
    public static void mergsort(int arr[],int  st, int mid,int ed) {
        int []a=new int[mid-st+1];
        int []b=new int [ed-mid];
        int []c=
        
        
    }
    
}
