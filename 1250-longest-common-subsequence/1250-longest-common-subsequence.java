class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i=text1.length();
        int j=text2.length();
        int dp[][]=new int[i][j]; 
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return print(text1,text2,i-1,j-1,dp);
        
    }
    public static int print(String s1,String s2,int i,int j,int dp[][]){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+print(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(print(s1,s2,i-1,j,dp),print(s1,s2,i,j-1,dp));

    }
}