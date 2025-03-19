class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;

        for(char a:s.toCharArray()){
            c^=a;
        }
        for(char x:t.toCharArray()){
            c^=x;
        }
        return c;
        
    }
}