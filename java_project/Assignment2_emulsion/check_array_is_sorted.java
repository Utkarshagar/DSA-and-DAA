package java_project.Assignment2_emulsion;
import java.util.*;

public class check_array_is_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
        sc.close();
    }
    public static boolean check(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i])
            cnt++;
        }
        if(arr[n-1]>arr[0])
        cnt++;
        return cnt<=1;
    }
}

