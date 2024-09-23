package java_project.codingblocksAssi1;

//public class  
import java.util.*;
public class viveklovearray {
    public static int findpoints(long []arr,int start,int end){
        if(start>=end)return 0;
        int i=start;
        int j=end;
        long leftsum=arr[i++];
        long rightsum=arr[j--];
        while(i<=j){
            if(leftsum<=rightsum)leftsum+=arr[i++];
            else rightsum+=arr[j--];
        }
        if(leftsum==rightsum){
          int left=  findpoints(arr,start,i-1);
          int right=  findpoints(arr,j+1,end);
          return Math.max(left,right)+1;
        }
        else return 0;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int testc=sc.nextInt();
        for(int i=0;i<testc;i++){
            int n=sc.nextInt();
            long []array=new long[n];
            for(int j=0;j<n;j++){
                array[j]=sc.nextLong();
            }
            int ans=findpoints(array,0,n-1);
            System.out.println(ans);
            
        }
        sc.close();

    }
}