package java_project;

import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        int a=1;
        print(a);



    }
    public static void print(int a){
        if(a==5){//base condition
            System.out.println(5);
        return;
    }
        System.out.println(a);
       
        
        print(a+1);
    }
}
    //     String a="hello";
    //     int b=10;
        
    //     message(a);
    //     message(a);
    //     message(a);
    //     message(a);
    // }
    //     static  void message(String a){
    //         System.out.println(a);
            
            
            
            
    //     }




    // }



















    //     int n=5;
    //     System.out.println(factorial(5));
    // }
    // private static int factorial(int n){
    //     if (n==0) {
    //         return 1;
            
    //     }
    //     int sp=factorial(n-1);
    //     int bp=sp*n;
    //     return bp;//code to find factorial
//     int a=2;
//     int b=3;
//     System.out.println (pow(a,b));
// }
//     private static int pow(int a,int b){
//         if(b==0)
//         return 1;
    
//     int sp=pow(a,b-1);
//     int bp=sp*a;
//     return bp; //return power of a
// int [] arr = {1,2,3,2,2};
// int target=2;
// System.out.println(find(arr,target,0));
//     }
// private static int find(int[] arr,int target,int idx){
//     if(idx==arr.length-1){
//         return -1;
//     }
//     if(arr[idx]==target){
//         return idx;

//     }
//     return find(arr,target,idx+1);//return starting index

// }
// int [] arr = {1,2,3,2,2};
// int target=2;
// System.out.println(find(arr,target,arr.length-1));
//     }
// private static int find(int[] arr,int target,int idx){
//     if(idx==-1){
//         return -1;
//     }
//     if(arr[idx]==target){
//         return idx;

//     }
//     return find(arr,target,idx-1);// return back index

// }
// int [] arr={1,2,3,2,2};
// int target=2;
// System.out.println(Arrays.toString(find(arr,target,0,0)));
// }
// private static int[] find(int []arr,int target,int idx,int count){//here we are making array of find
//     if(idx == arr.length){
//         return new int[count];

//     }
//     if(arr[idx]==target){
//         count++;
//     }
//     int ans[]=find(arr,target, idx + 1 ,count);
//     if(arr[idx]==target)
//     ans[count-1]=idx;
//     return ans;//return index of array

// }
// int num=5;
// count();}
//  static void count(){
//     int i=1;
    
//         System.out.println(i);

    
// }






//     }
    



