package java_project.codingblocksAssi1;
import java.util.*;

public class all_indexes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int array[]=new int[a];
        for(int i=0;i<a;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        function(0,target,array,a);

        

    }
    public static void  function(int count,int target,int array[],int a){
        if(count==a){
            return;
        }
        if(array[count]==target){
            System.out.print(count+" ");}
       
        function( count+1,target,array,a); 
    

    }
}
