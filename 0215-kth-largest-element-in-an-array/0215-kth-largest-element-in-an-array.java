class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>m=new PriorityQueue<>();
        for(int a:nums){
            m.add(a);
            if(m.size()>k)
            {
                m.poll();
            }
        }
        return m.peek();
        
    }
}