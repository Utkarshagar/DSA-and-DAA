package java_project.codingblocksAssi1;


import java.util.*;
public class rat_chase_cheese {
    public static int found=0;
    public static void findpath(int[][] ans,char[][] que,int i,int j,int m,int n){
        if(i==m-1&&j==n-1){
            ans[i][j]=1;
            for(int p=0;p<m;p++){
                for(int q=0;q<n;q++){
                    System.out.print(ans[p][q]+" ");
                }
                System.out.println();
            }
            found=1;
            return;
        }
        if(i<m-1&&que[i+1][j]!='X'&&ans[i+1][j]!=1){
            ans[i][j]=1;
            findpath(ans,que,i+1,j,m,n);
            ans[i][j]=0;
        }
        if(j<n-1&&que[i][j+1]!='X'&&ans[i][j+1]!=1){
            ans[i][j]=1;
            findpath(ans,que,i,j+1,m,n);
            ans[i][j]=0;
        }
        if(i>0&&que[i-1][j]!='X'&&ans[i-1][j]!=1){
            ans[i][j]=1;
            findpath(ans,que,i-1,j,m,n);
            ans[i][j]=0;
        }
        if(j>0&&que[i][j-1]!='X'&&ans[i][j-1]!=1){
            ans[i][j]=1;
            findpath(ans,que,i,j-1,m,n);
            ans[i][j]=0;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char [][]que=new char[m][n];
        int [][]ans=new int [m][n];
        for(int i=0;i<m;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                que[i][j]=s.charAt(j);
            }
        }
        findpath(ans,que,0,0,m,n);
        if(found==0)
        System.out.print("NO PATH FOUND");
    }
}