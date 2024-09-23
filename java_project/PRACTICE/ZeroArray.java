package java_project.PRACTICE;

import java.util.Scanner;

public class ZeroArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean canMakeZero = canMakeArrayZero(n, arr);
            System.out.println(canMakeZero ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean canMakeArrayZero(int n, int[] arr) {
        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        // Check if the sum is even and greater than or equal to 2 times the maximum odd element
        // This is necessary for the parity of operations to work
        return (sum % 2 == 0) && (max * 2 <= sum);
    }
}
