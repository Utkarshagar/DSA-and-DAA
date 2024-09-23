package java_project.class_codes_and_extracode;

public class linear_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
        int size=4;
        System.out.println(print(arr,target,size));
    }
    public static boolean print(int arr[],int target,int size){
        if(target==arr[size]){
            return true;
        }
        if(size==0)
        return false;
        return print(arr,target,size-1);

    }
    
}
