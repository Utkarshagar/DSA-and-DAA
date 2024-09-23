package java_project.lecture1;

import java.util.Arrays;

public class QUICKSORTbyME {
    public static void main(String[] args) {
        int arr[]={1,2,10,5,8,9};
        int n=arr.length;
        print(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void print(int arr[],int start,int end) {
        if(start>end){
            return;
        }
        int pivot=quick(arr,start,end);
        print(arr, start,pivot-1 );
        print(arr,pivot+1,end);
        
    }
    public static int quick(int arr[],int start,int end) {
        // int pivot=arr[ei];
        // int pi=si;
        // for(int i=si;i<ei;i++){
        //     if(arr[i]<=pivot){
        //         int t=arr[i];
        //         arr[i]=arr[pi];
        //         arr[pi]=t;
        //         pi++;
                
        //     }
        // }
        // int t=arr[ei];
        // arr[ei]=arr[pi];
        // arr[pi]=t;
        // return pi;
        int a=arr[end];
        int pi=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=a){
                int t=arr[i];
                arr[i]=arr[pi];
                arr[pi]=t;
                pi++;
            }
        }
        int t=arr[end];
        arr[end]=arr[pi];
        arr[pi]=t;
        return pi;


        
    }
    
}
