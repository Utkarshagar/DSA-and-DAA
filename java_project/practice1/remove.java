package java_project.practice1;
import java.util.*;

public class remove {
    public static void main(String[] args) {
        int arr[]={1,2,34,4,5};
        int x=arr.length;
        int n=2;
        for(int i=0;i<arr.length;i++){
            if(i==(x-n)){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }

        }
        //System.out.print(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
