package java_project.PRACTICE;

import java.util.*;
public class count {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        // for(int i=0;i<a.length();i++){
            
        // }
        // System.out.println(StringUtils.countMatches(a,"hi") );
        //int count = a.("elephant", "e");

        if(a.contains("hi")){

            count++;
        }
        System.out.println(count);
        System.out.println(a.replaceAll("hi",""));
        System.out.println(a.replaceAll("hi","bye"));
        System.out.println(a.contains("hi"));
        // System.out.println(Integer.parseInt(a));// that can be used to convert String to integer
        CharSequence ch=a;
        System.out.println(ch);




        // Your Code Here
    }
}