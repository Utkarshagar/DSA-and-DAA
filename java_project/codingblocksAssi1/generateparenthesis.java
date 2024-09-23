package java_project.codingblocksAssi1;

//public class generateparenthesis 
import java.util.*;
public class generateparenthesis  {
    public static void main(String args[]) {
        //int a = 3;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //list we form
        //List<String> list = new ArrayList<>();
        print(a, 0, 0, "");
        //String s="";
        
        int arr=3;
        prr(arr);
        }
        //method we call
        private static void print(int a, int open, int close, String an) {
            if (open == a && close == a) {
                System.out.println(an);
                return;
            }
                // idf part
                if(open>close){
                    print(a, open, close+1, an+")");
                }
                    if(open<a) {
                        print(a, open+1, close, an+"(");
                        }
                        }
                        private static void prr(int arr){
                            int b=3;
                            for(int i=1;i<5;i++){
                                b=b+i;

                            }
                        }



    
}
