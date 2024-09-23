package java_project.String;

public class string_reverse {
    

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static void main (String args[]){
    String str="hello world";
    reverseWord(str);
    
}
    public static void reverseWord(String str)
    {
        // Reverse the string str
       
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("rev");
       
    }
}
    
}
