package java_project.dsa_Backtracking;

public class q1backtracking {
    public static void main(String[] args) {
        String str="ABC";
        Print( str,"",0);

        
        
    }
    public static void Print(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;

        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            Print(newstr,perm+currchar,idx+1);
        }
    }

    
}
