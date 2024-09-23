package java_project.array;

import java.util.Scanner;

public class multi_dimensional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  int c[][]={{1,2,3},{4,45,6},{8,9,1}};
        
        int arr[][]=new int [3][3];
        for(int row=0;row<arr.length;row++){
            // for row
            for(int col=0; col<arr[row].length;col++){
                //column length
                arr[row][col]=sc.nextInt();

            }

            
        
    }
    
}
