package java_project.recursion_practice;
import java.util.*;

public class generate_parenthesis {
    public static List<String>  main(String[] args) {
        int n=3;
        List<String>list=new ArrayList<>();
        print(n,0,0,"",list);
        return list;
        
    }
    private static void print(int n,int open,int close,String ans,list<String> list){
    if(open==n && close==n){
        list.add(ans);
        return ;
    }
    if(open<n){
        print(n,open+1,close,ans+"(",list);
    }
    if(close<open){
        print(n,open,close+1,ans+")",list);

    }
}
}
