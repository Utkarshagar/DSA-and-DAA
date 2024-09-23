package java_project.recursion_practice;

public class check_array_sorted {
    public static void main(String[] args) {
        int index;
        int size=5;
        int arr[]={1,3,4,5,6};
        System.out.println(print(arr,1,size));
    }
    public static  boolean print(int arr[],int index,int size){
        if(index==size){
            return true;
        }
        if(arr[index-1]>arr[index]){
            return false;

        }
        return print(arr, index+1, size);
    }
    
}
