package java_project.codingblocksAssi1;

import java.util.*;
public class ReplacehiPart2 {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(count(s));
       System.out.println(remove(s));
       System.out.println(replace(s));
    }
    public static int count(String s){
        if(s.length()<2){
            return 0;
        }
        if(s.startsWith("hi") && !s.startsWith("hit")){
            return 1+count(s.substring(2));
        }
        return count(s.substring(1));
    }
    public static String remove(String s){
        if(s.length()<2){
            return s;
        }
        if(s.startsWith("hi") && !s.startsWith("hit")){
            return remove(s.substring(2));
        }
        return s.charAt(0)+remove(s.substring(1));
    }
    public static String replace(String s){
        if(s.length()<2){
            return s;
        }
        if(s.startsWith("hi") && !s.startsWith("hit")){
            return "bye"+ replace(s.substring(2));
        }
        return s.charAt(0)+replace(s.substring(1));
    }
}