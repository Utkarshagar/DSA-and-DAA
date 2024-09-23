package java_project.array;

import java.util.Scanner;
import java.util.*;

public class codeforces2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int target=sc.nextInt();
            int elem=sc.nextInt();
            int arr[]=new int[elem];
            for(int j=0;j<elem;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0;
            
            Arrays.sort(arr);
            for(int k=0;k<arr.length-1;k++){

                if(arr[k]==1){
                    sum=sum+1;
                }
                else{
                    sum=sum+((arr[k]*2)-1);
                }
            }
            System.out.println(sum);
    }
    
}
}