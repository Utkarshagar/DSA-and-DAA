package java_project.PRACTICE.viva_practice;

//import javax.sql.rowset.spi.SyncResolver;

public class fabonaciseriessum {
    public static void main(String[] args) {
        int n=10;
    int arr[]=new int [n+1];
    arr[0]=0;
    arr[1]=1;
    int sum=arr[0]+arr[1];
    for(int i=2;i<=n;i++){
        arr[i]=arr[i-2]+arr[i-1];
        System.out.print(arr[i]+" ");
        sum+=arr[i];

    }
    System.out.print(sum);
        
    }
    


    
}
