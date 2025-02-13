import java.util.*;
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int a:nums){
            pq.add((long)a);

        }
        int count=0;
        while(pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            long z=x*2+y;
            pq.add(z);
            count++;
        }
        return count;
        
    }
}