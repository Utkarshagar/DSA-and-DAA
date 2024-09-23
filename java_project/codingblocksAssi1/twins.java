package java_project.codingblocksAssi1;

import java.util.*;
public class twins {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //int a=str.length();
        System.out.println(target(str));
        //int arr=6;
                
                        }
                        public static int target(String str){
                            if(str.length()<3){
                                return 0;
                            }
                            else{
                                if(str.charAt(0)==str.charAt(2)){
                                    return 1+target(str.substring(1));
                                }//else statement again call
                                else{
                                    return target(str.substring(1));}
                    
                            }
                        }
                    }
            
