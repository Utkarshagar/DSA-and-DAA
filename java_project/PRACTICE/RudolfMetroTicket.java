package java_project.PRACTICE;

import java.util.*;

public class RudolfMetroTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] leftCoins = new int[n];
            int[] rightCoins = new int[m];

            for (int i = 0; i < n; i++) {
                leftCoins[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                rightCoins[i] = scanner.nextInt();
            }

            int count = countWaysToBuyTicket(n, m, k, leftCoins, rightCoins);
            System.out.println(count);
        }

        scanner.close();
    }

    private static int countWaysToBuyTicket(int n, int m, int k, int[] leftCoins, int[] rightCoins) {
        int count = 0;

        Arrays.sort(leftCoins);
        Arrays.sort(rightCoins);

        int leftIndex = n - 1;
        int rightIndex = 0;

        while (leftIndex >= 0 && rightIndex < m) {
            int sum = leftCoins[leftIndex] + rightCoins[rightIndex];
            if (sum <= k) {
                count += (leftIndex + 1); // All the coins with index <= leftIndex are valid choices
                rightIndex++;
            } else {
                leftIndex--;
            }
        }

        return count;
    }
}

