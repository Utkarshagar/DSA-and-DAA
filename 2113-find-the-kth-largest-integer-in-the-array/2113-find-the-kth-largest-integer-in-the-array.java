import java.math.BigInteger;
import java.util.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
       PriorityQueue<BigInteger>q=new PriorityQueue<>();
       for(String a:nums){
        q.offer(new BigInteger(a));
       }
    int x=(nums.length-k)+1;
    BigInteger num=null;
    while(x!=0){
        num=q.poll();
        x--;

    }
    return num.toString();

        
    }
}