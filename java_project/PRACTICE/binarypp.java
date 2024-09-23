package java_project.PRACTICE;

public class binarypp {
    public static void main(String[] args) {
        int target=3;
        int arr[] = {9,8,7,6,5,4,3,2};
        System.out.println(print(arr,target));

        
    }
    public static int print(int arr[], int target) {
        int start=0;
        int end=(arr.length)-1;
        boolean a=arr[start]<arr[end] ;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            // if(start<end){
            //     boolean a=true;
            // }
            if(a){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else
                end=mid-1;
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else
                end=mid-1;
            }

            
        }
        return -1;


    }
}
    

        
    
