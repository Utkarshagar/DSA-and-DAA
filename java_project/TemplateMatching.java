package java_project;

import java.util.Scanner;

public class TemplateMatching {
    public static void main(String[] args) {
        TemplateMatching templateMatching = new TemplateMatching();
        templateMatching.solve();
    }

    private void solve() {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();

            boolean validTemplate = isTemplateValid(n, a, b, c);
            System.out.println(validTemplate ? "YES" : "NO");
        }

        scanner.close();
    }

    private boolean isTemplateValid(int n, String a, String b, String c) {
        for (int i = 0; i < n; i++) {
            char ai = a.charAt(i);
            char bi = b.charAt(i);
            char ci = c.charAt(i);

            // Check if there exists a template for the given conditions
            if ((Character.isLowerCase(ai) && ai != bi && ai == ci) ||
                (Character.isLowerCase(bi) && ai != bi && bi == ci) ||
                (Character.isUpperCase(ci) && ai == bi && ci != ai)) {
                return false;
            }
        }
        return true;
    }
}
