package java_project.Assignment2_emulsion;
import java.util.*;

public class Rotate_array_left {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            rotateArr(arr, d, n);
            System.out.println(Arrays.toString(arr));
            sc.close();
        }
        static void rev(int[] arr,int i,int j){
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        static void rotateArr(int arr[], int d, int n) {
            d = d%arr.length;
            if(d<0){
                d+=arr.length;
            }
            rev(arr,d,n-1);
            rev(arr,0,d-1);
            rev(arr,0,n-1);
            
        }
    }
    