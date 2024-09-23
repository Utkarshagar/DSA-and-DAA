package java_project;

import java.util.Arrays;

public class rough_work {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                index=i;
                break;
            }
           
           
            // else{
            //     System.out.println(-1);
            // }

        }
        if(index==-1){
            System.out.println(-1);
        }
        else{
            System.out.println(index);
        }
        
    //    int a=arr.length-1;
    //     for(int i=0;i<arr.length;i++){
    //         if(i==a){
    //             arr[a]=arr[a]+1;
    //         }

    //     }
    //     System.out.println(Arrays.toString(arr)); 
    //     int k=9;
        
    //     int start=0;
    //     int end=arr.length-1;
    //     int mid=(start+end)/2;
       
    //    while(start<end){
    //     mid=(start+end)/2;
    //         if(arr[mid]==k){
    //             System.out.println(mid);
    //             break;
    //         }
    //         else if(arr[mid]<k){
    //             start=mid+1;

    //         }
    //         else{
    //             end=mid-1;
    //         }
            

    //     }
    //     if(arr[mid]!=k){
    //         System.out.println(-1);
    //     }
       
        
    
}
}
