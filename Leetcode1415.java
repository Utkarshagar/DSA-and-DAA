import java.util.ArrayList;
import java.util.List;

public class Leetcode1415 {
    class Solution {
    public String getHappyString(int n, int k) {
        List<String> lst = new ArrayList<>();
        getHappy("",' ',lst,n);
      
        String result = k>lst.size()?"":lst.get(k-1);
        return result;
    }
    public void getHappy(String ans, char lastChar,List<String> lst,int n){
        if(ans.length()==n){
            lst.add(ans);
            return;
        }
        
        for (char c : new char[]{'a', 'b', 'c'}) {
            if (c != lastChar) { 
                getHappy(ans + c, c, lst, n);
            }
        }
    }
}
    
}
