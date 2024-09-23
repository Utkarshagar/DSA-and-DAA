package java_project.codingblocksAssi1;

import java.util.Scanner;

public class single_in_engin {
    public static void main(String[] args) {
         Scanner scc=new Scanner(System.in);
        int nn=scc.nextInt();
        int minn=0;
        int maxa=0;
        int a[]=new int[nn];
//        loop
        for(int i=0;i<nn;i++){
            a[i]=scc.nextInt();
            maxa=Math.max(maxa,a[i]);
            minn=Math.min(minn,a[i]);
        }
        int x=scc.nextInt();
        int loo=minn;
        int hii=maxa;
        int anns=0;
//        loop
        while (loo<=hii){
            int mid=(loo+hii)/2;
            if(isitpos(a,mid,x)){
                anns=mid;
                loo=mid+1;
            } 
            else{
                hii=mid-1;
            }
        }
        System.out.println(anns);
    }
    //    function
    public static boolean isitpos(int arr[],int mid,int x){
        int ww=0;
        for(int i=0;i<arr.length;i++){
            int dd=arr[i]-mid;
            if(dd>0){
                ww+=dd;
            }
            if(ww>=x){
            return true;
            }
        }
        return false;
    }



        
    
    
}
