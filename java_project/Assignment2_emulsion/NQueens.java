package java_project.Assignment2_emulsion;

// public class N-1_Queen {
    
// }
import java.util.*;
public class NQueens{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        int count = combinations(a-1, arr, 0 , 0);
        System.out.println(count);
    }
    public static int combinations(int q, int [][]arr, int r, int count){
        if(q == 0){
            return count + 1;
        }
        if(r == arr.length){
            return count;
        }
        for(int i = r; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(isPossible(arr, i, j)){
                    arr[i][j] = 1;
                    count = combinations(q-1, arr, i + 1, count);
                    arr[i][j] = 0;
                }
            }
        }
        return count;
    }
    public static boolean isPossible(int arr[][], int r, int c){
        for(int i = 0; i < arr.length; i++){
            if(arr[i][c] == 1)
            return false;
        }
        int left = Math.min(r, c);
        for(int i = 1; i <= left; i++){
            if(arr[r - i][c - i] == 1)
            return false;
        }
        int right = Math.min(r, arr.length - c - 1);
        for(int i = 1; i <= right; i++){
            if(arr[r - i][c + i] == 1)
            return false;
        }
        return true;
    }
}