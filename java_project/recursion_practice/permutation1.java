package java_project.recursion_practice;

public class permutation1 {
    public static void main(String[] args) {
        String s="abc";
        print(s,"");
    }
    private static void print(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            String str=s.substring(0,i)+s.substring(i+1);
            
            print(str,ans+s.charAt(i));
        }


    }
    
}
