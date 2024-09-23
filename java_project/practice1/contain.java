package java_project.practice1;

import java.util.Scanner;

public class contain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favToy = sc.nextLine(); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
        int count = 0; 

        for (int i = 0; i < n; i++) {
            String toy = sc.nextLine(); 
            if (isSubsequence(toy, favToy)) {
                count++; 
            }
        }

        System.out.println(count); 
        sc.close(); 
    }

    
    public static boolean isSubsequence(String s, String t) {
        int indexS = 0, indexT = 0;
        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        return indexS == s.length();
    }
}

