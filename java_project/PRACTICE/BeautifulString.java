package java_project.PRACTICE;

import java.util.Scanner;

// public class BeautifulString 

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();

//         while (t-- > 0) {
//          {   int n = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character
//             String s = scanner.nextLine();

//             int minDeletions = getMinDeletionsToMakeBeautiful(n, s);
//             System.out.println(minDeletions);
//         }

//         scanner.close();
//     }

//     private static int getMinDeletionsToMakeBeautiful(int n, String s) {
//         int minDeletions = 0;

//         for (int i = 0; i < n - 2; i++) {
//             if ((s.charAt(i) == 'p' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) == 'e') ||
//                 (s.charAt(i) == 'm' && s.charAt(i + 1) == 'a' && s.charAt(i + 2) == 'p')) {
//                 // Found "pie" or "map", increment minDeletions and skip the next two characters
//                 minDeletions++;
//                 i += 2;
//             }
//         }

//         return minDeletions;
//     }
// }
import java.util.*;
public class BeautifulString  {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		LinkedList<Integer>ll=new LinkedList<>();
		for(int i=0;i<t;i++){
			int a=sc.nextInt();
			for(int j=0;j<a;j++){
				int num=sc.nextInt();
				ll.add(num);
			}
			int b=sc.nextInt();
			for(int j=a;j<b+a;j++){
				int num2=sc.nextInt();
				ll.add(num2);
			}
		}

    }
}
