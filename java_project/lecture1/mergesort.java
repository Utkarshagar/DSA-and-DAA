package java_project.lecture1;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7, 8, 9};
        int[] arr2 = {3, 5, 6};

        merg(arr1,arr2);

    }

    public static void merg(int arr1[], int arr2[]) {
        int[] ans = new int[(arr1.length + arr2.length)];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

       
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        System.out.print(Arrays.toString(ans));
    }
}
