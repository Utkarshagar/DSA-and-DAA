package java_project.practice1;

public class array_is_sorted {
    public static void main(String[] args) {
        int arr[]={1,5,6};
        boolean a=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
               a=false;
               break;
            }
            // else{
            //     a=false;
            //     //System.out.println(a);
            // }
        }
        System.out.println(a);
    }
    
}
