package java_project.practice1;

public class reverse {
    public static void main(String[] args) {
        String str="abcd";
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(s+str.charAt(i));
        }
    }
    
}
