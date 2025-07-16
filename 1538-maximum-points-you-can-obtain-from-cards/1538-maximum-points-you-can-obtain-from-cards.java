class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ls=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            ls+=cardPoints[i];

        }
        int maxsum=ls;
        int rs=0;
        for(int j=k-1;j>=0;j--){
            ls=ls-cardPoints[j];
            rs+=cardPoints[n-1];
            n=n-1;
            maxsum=Math.max(maxsum,ls+rs);

        }
        return maxsum;
        
    }
}