public class Leetcode3461 {
    class Solution {
        public boolean hasSameDigits(String s) {
            int n=s.length();
            
            while(s.length()>2){
                String k="";
                 for(int i=0;i<s.length()-1;i++){
                int a=Character.getNumericValue(s.charAt(i));
                int b=Character.getNumericValue(s.charAt(i+1));
                k+=(a+b)%10;
                }
                s=k;
    
            }
    
           
               if(s.length()==2 && s.charAt(0)==s.charAt(1)) return true;
               else return false;
    
            
        }
    }
    
}
