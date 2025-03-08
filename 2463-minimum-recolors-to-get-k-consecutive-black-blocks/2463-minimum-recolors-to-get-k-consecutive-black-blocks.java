class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        
        int z=Integer.MAX_VALUE;
        
        for(int i=0;i<=n-k;i++){
            int w=0;
        int b=0;
            for(int j=i;j<k+i;j++){
                if(blocks.charAt(j)=='W') w++;
                if(blocks.charAt(j)=='B') b++;
            }
            if(b>=k){
                return 0;
            }
            int r=k-b;
           z=Math.min(z,r);
            
            
        }
        return z;
    }
}