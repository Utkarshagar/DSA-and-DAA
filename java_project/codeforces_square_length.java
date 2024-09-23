package java_project;

import java.util.*;



public class codeforces_square_length {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for( int j=0;j<t;j++){
        int []a=new int[4];
        int []b=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int length=Math.max(Math.abs(a[1]-a[0]),Math.abs(b[1]-b[0]));
        int area=length*length;
        System.out.println(area);

        }
   


    
   }
    
    
}
