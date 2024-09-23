package java_project.practice1;
import java.util.*;

public class removeduplicateschar {
    static boolean arr[]=new boolean[25];
    public static void main(String[] args) {
        String str="aabcdee";
        String s="";
        int i=0;
        HashSet<String> set=new HashSet<>(); 
        print(i, str, s,set);
        
    }
    public static void print(int i,String str,String s,HashSet<String> set){
        if(i==str.length()){
            if(set.contains(s)){
                return;

            }
            else{
            System.out.println(s);
            set.add(s);
            return;
        }
    }
        char current=str.charAt(i);//default value in booleaan array is false
        if(arr[current-'a']==true){
            print(i+1, str, s,set);

        }
        else{
            s=s+current;
            arr[current-'a']=true;
            print(i+1, str, s,set);
        }
    }
    
}
