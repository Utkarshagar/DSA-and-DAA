package java_project.linked_list;

// public class node_remove_element {
    
// }
import java.util.*;
public class node_remove_element {
    public static void main (String args[]) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        
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
