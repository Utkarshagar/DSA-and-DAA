class Solution {
    public boolean checkPowersOfThree(int n) {
        int sum=0;
        for(int i=16;i>=0;i--){
            if(Math.pow(3,i)<=n){
                sum+=Math.pow(3,i);
                double a=Math.pow(3,i);
                int y=(int) a;

                n=n-y;
            }
        }
       
        return n==0;
        
    }
}