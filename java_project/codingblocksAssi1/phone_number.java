package java_project.codingblocksAssi1;

import java.util.*;


public class phone_number {
    static String [] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main (String args[]) { 
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String>array = new ArrayList<>();
        Print(s,array,"");
        for(String string:array){
            System.out.print(string+" ");
        }
        int Size=array.size();
        System.out.println();
        System.out.print(Size);
        int ar=6;
        prr(ar);
        
        
    }
    //main block is end
   public static void Print(String s,ArrayList<String> array,String Ans){
       if(s.length()==0){
           //if(Ans.length()!=0)
            array.add(Ans);
           return;
       }
       //function end
       char ch=s.charAt(0);
       String ques=arr[ch-'0'-1];
       for(int i=0;i<ques.length();i++){
           Print(s.substring(1),array,Ans+ques.charAt(i));
       }
   }
   //private block Start
   private static void prr(int ar){
    int b=3;
    for(int i=1;i<5;i++){
        b=b+i;

     }
    
}
}
