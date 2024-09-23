package java_project.codingblocksAssi1;


import java.util.*;

public class lastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int array[]=new int[a];
        for(int i=0;i<a;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(function(a-1,target,array,a));

        

    }
    public static int  function(int count,int target,int array[],int a){
        if(count<0){
            return -1;
        }
        if(array[count]==target){
            return count; 
        }
        else{
        return function( count-1,target,array,a); 
    }

    }
    
}

