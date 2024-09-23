package java_project.lecture1;

import java.util.Arrays;

public class merge {

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1, 8, 6, 4, 2};
        
        merge mergeSort = new merge();
        mergeSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // Implementation of the merge operation goes here
        // (This part should be similar to your previous 'merg' method)
    }
}
