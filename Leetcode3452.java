import java.util.ArrayList;

public class Leetcode3452 {
    class Solution {
    public int sumOfGoodNumbers(int[] arr, int k) {
        ArrayList<Integer>nums=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if((i-k)<0 ){
                if(arr[i+k]<arr[i])
                sum+=(arr[i]);
            }
            if((i+k)>arr.length-1){
                if(arr[i-k]<arr[i]){
                    sum+=arr[i];
                }
            }
        }
        for(int i=k;i<arr.length-k;i++){
            if(arr[i-k]<arr[i] && arr[i+k]<arr[i]){
                sum+=(arr[i]);
            }


        }
        return sum;
        
            
        
        
    }
}
    
}
