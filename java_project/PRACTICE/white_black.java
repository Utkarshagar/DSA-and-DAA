package java_project.PRACTICE;
import java.util.*;

public class white_black {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            int firstBlack = -1;
            int lastBlack = -1;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    if (firstBlack == -1) {
                        firstBlack = j;
                    }
                    lastBlack = j;
                }
            }

            if (firstBlack == -1) {
                // All cells are white
                System.out.println(0);
            } else {
                // Calculate the minimum length of the continuous segment to be painted white
                int segmentLength = lastBlack - firstBlack + 1;
                System.out.println(segmentLength);
            }
        }
    }
}
