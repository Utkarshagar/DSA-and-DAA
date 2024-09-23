package java_project.PRACTICE;
import java.util.*;


public class duplicates_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<a;i++){
        //     System.out.println(arr[i]);

        // }
        Arrays.sort(arr);
        boolean foundduplicate=false;
        for(int i=0;i<(a-1);i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                foundduplicate=true;
            }
            
            
            

        }
        if (!foundduplicate){
            System.out.println("-1");
        }

        
        
            
        
    }
    
}
