class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        // int i=0;
        // int j=s.length()-1;
       for(int i=0;i<s.length()-1;i++ ){
        if(s.charAt(i)==s.charAt(i+1)) return false;
       }
       return true;
    }
}