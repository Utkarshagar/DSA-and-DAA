package java_project.String;

import java.util.Arrays;

public class intro_string {
    public static void main(String[] args) {
        // String Decleration
        String name="Utkarsh";
        String name2="Utkarsh agarwal";//here spaces is also allow in string te spaces are 
        //valid character in string
        String sentence="my name is utkarsh ";// string is a class as it start with capital letter
        // String pool
        String a="utkarsh";
        String b="utkarsh";
        System.out.println(a==b);
        //== checks the reference variable are pointing to the same object
        // how to create diff object of same value
        String c=new String("utkarsh");
        String d=new String("utkarsh");
        System.out.println(c==d);
        // when you only need to check value use equals method
        System.out.println(c.equals(d));
        // charAt(write index over here)
        System.out.println(a.charAt(1));
        System.out.println(c.charAt(3));
        // Arrays to string
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //String e="56";
        int e=56;
        System.out.println(Integer.toString(e));




        
    }
    
}
