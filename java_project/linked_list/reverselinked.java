package java_project.linked_list;

// public class reverselinked {
    
// }
import java.util.*;
public class reverselinked  {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
