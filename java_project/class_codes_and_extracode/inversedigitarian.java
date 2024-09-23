package java_project.class_codes_and_extracode;
//import java.util.*;
//n

//public class inversedigitarian {

import java.util.*;
public class inversedigitarian{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int l=print(num);
        int[] arr=new int[l];
        rev(arr,num);
        int[] na=new int[l];
        for(int i=0;i<arr.length;i++)
        {
            na[arr[i]-1]=i+1;
        }
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(na[i]);
        }
    }
    public static int print(int num)
    {
        
        int size=0;
        if(num==0)
        {
            size=1;
        }
        while(num>0)
        {
            size++;
            num/=10;
        }
        return size;
    }
    public static void rev(int[] arr,int num)
    {
        int i=0;
        while(num>0)
        {
            arr[i]=num%10;
            num/=10;
            i++;
        }
    }
}