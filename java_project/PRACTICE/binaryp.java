package java_project.PRACTICE;

public class binaryp {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;
        int target=5;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("The index of target is " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(-1);
    }

    
}
