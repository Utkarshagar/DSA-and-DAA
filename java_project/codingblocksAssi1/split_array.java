package java_project.codingblocksAssi1;

//public class split_array 
import java.util.*;
public class split_array {
    public static int cnt=0;
    public static void findallpartitionstring(int []arr,boolean []check,int idx,int leftsum,int rightsum){
        if(leftsum==rightsum){
            display(check,arr);
            cnt++;
            return;
        }
        if(idx==arr.length)return;
        check[idx]=true;
        findallpartitionstring(arr,check,idx+1,leftsum-arr[idx],rightsum+arr[idx]);
        check[idx]=false;
        findallpartitionstring(arr,check,idx+1,leftsum,rightsum);


    }
    public static void display(boolean []check,int []arr){
        for(int i=0;i<arr.length;i++){
            if(check[i]==true){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("and ");

        for(int i=0;i<arr.length;i++){
            if(check[i]==false){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        boolean []check=new boolean[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        findallpartitionstring(arr,check,0,sum,0);
        System.out.print(cnt);
    }
}

