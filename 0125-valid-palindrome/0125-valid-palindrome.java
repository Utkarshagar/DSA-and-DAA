class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));

            }
        }
        StringBuilder m=new StringBuilder(sb);
        m.reverse();
        return(sb.toString()).equals(m.toString());

        
    }
}