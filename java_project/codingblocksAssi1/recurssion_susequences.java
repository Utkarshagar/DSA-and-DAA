package java_project.codingblocksAssi1;

// public class recurssion_susequences 
import java.util.*;
public class recurssion_susequences  {
    public static int cnt=0;
    public static void allsubsequences(String s,String ans,int idx,List <String> list){
        if(idx>=s.length()){
            list.add(ans);
            cnt++;
            return;
        }
        allsubsequences(s,ans+s.charAt(idx),idx+1,list);
        allsubsequences(s,ans,idx+1,list);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String meristring=sc.next();
        List <String> list=new ArrayList<>();
        allsubsequences(meristring,"",0,list );
        // Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(cnt);
    }
}
