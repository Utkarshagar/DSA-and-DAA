package java_project.recursion_practice;

public class binary_sarch_using {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        int key=8;
        System.out.println(print(arr,start,end,key));
    }
    public static boolean print(int arr[],int start,int end,int key) {
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==key){
            return true;
        }
        //leftcall
        if(arr[mid]>key)
        return print(arr, start, mid-1, key);
        //right call
        else
        return print(arr, mid+1, end, key);
        
    }
    
}
