package java_project.recursion_practice;

public class permutation2 {
    public static void main(String[] args) {
        String s="aba";
        print(s,"");
    }
    private static void print(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    flag=true;
                }
            }
            if(flag==false)
            
            
            print(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
        }


    }
    
}
