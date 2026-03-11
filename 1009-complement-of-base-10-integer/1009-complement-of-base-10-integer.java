class Solution {
    public int bitwiseComplement(int n) {
        String f=Integer.toBinaryString(n);
        String d="";
        for(char c:f.toCharArray()){
            if(c=='1'){
                d+='0';
            }
            if(c=='0'){
                d+='1';
            }

        }
    return Integer.parseInt(d,2);

        
    }
}