package java_project.array;
import java.util.*;
public class simpleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++ ){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);//not print the whole value like that as it print the value in loop only single value 
        //we does not print the whole value like that
        
        
    }
    

}
    

