package java_project.lecture1;
import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,9,7,5};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort (int[] arr,int si,int ei){

        if(si>ei){  //base condition
            return;
        }
        int pi=pivotIndex(arr,si,ei);
        QuickSort(arr, si, pi-1);
        QuickSort(arr, pi+1, ei);

    }
    public static int  pivotIndex(int[]arr,int si,int ei) {
        int pivot=arr[ei];
        int pi=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                int t=arr[i];
                arr[i]=arr[pi];
                arr[pi]=t;
                pi++;
                
            }
        }
        int t=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=t;
        return pi;

        
    }
    
}
