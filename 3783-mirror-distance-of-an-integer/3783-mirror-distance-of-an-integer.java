class Solution {
    public int mirrorDistance(int n) {
        int z=n;
        int d=0;
        while(n!=0){
            int f=n%10;
            d=d*10+f;
            n=n/10;
        }
        return Math.abs(d-z);
        
    }
}