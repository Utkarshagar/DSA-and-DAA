class Solution {
    public int hammingWeight(int n) {
        // String binary = Integer.toBinaryString(number);
        int count=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0){
                count++;

            }
            mask<<=1;

        }
        return count;

        
    }
}