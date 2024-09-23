package java_project.PRACTICE;

import java.util.Scanner;

public class WhiteBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Length of the strip
            String s = sc.next(); // String representing the strip

            int minSegmentLength = Integer.MAX_VALUE;
            int currentSegmentLength = 0;

            // Iterate through the strip
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    // Reset the current segment length when encountering a black cell
                    currentSegmentLength = 0;
                } else {
                    // Increment the current segment length for white cells
                    currentSegmentLength++;
                }

                // Update the minimum segment length
                minSegmentLength = Math.min(minSegmentLength, currentSegmentLength);
            }

            System.out.println(minSegmentLength);
        }
    }
}
