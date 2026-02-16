class Solution {
    public int reverseBits(int n) {
      
        String s = String.format("%32s", Integer.toBinaryString(n))
                         .replace(' ', '0');

        StringBuilder b = new StringBuilder();

        
        for (int i = s.length() - 1; i >= 0; i--) {
            b.append(s.charAt(i));
        }

       
        return (int) Long.parseLong(b.toString(), 2);
    }
}
