import java.math.BigInteger;
import java.util.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        ArrayList<BigInteger>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //  System.out.println(nums[i]);
            // int y=Integer.parseInt(nums[i]);
            // System.out.println(y);
            arr.add(new BigInteger(nums[i]));
        }
        Collections.sort(arr);

        
        return arr.get(arr.size()-k).toString();
    
        
    }
}