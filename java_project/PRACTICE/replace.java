package java_project.PRACTICE;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        // System.out.println(s.charAt);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==0){
                replace(s.charAt(i))
            }
        }
        System.out.print(s);
    }
    
}
